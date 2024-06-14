package com.furjoy.authentication.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.furjoy.authentication.model.User;
import com.furjoy.authentication.products.Product;
import com.furjoy.authentication.products.ProductRepository;
import com.furjoy.authentication.products.ProductRepository;
import com.furjoy.authentication.repository.UserRepository;

@Controller
public class AdminController {
    @Autowired
    private AdminService userService;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/adminlogin")
    public String loginPage() {
        return "adminlogin";
    }
    
    @GetMapping("/adminHome")
    public String Home() {
        return "adminHome";
    }
    @PostMapping("/adminlogin")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (userService.authenticate(username, password)) {
            return "redirect:/adminHome"; // Successful login, redirect to dashboard
        } else {
            return "redirect:/adminlogin?error"; // Redirect back to login page with an error message
        }
    }
    
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "user-list"; // This corresponds to your user-list.html template
    }
    
    @PostMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        // Use the UserRepository to delete the user by ID
        userRepository.deleteById(id);
        return "redirect:/users"; // Redirect to the user list page after deletion
    }
    
    @GetMapping("/productslist")
    public String listProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "product-list"; // Create a product-list.html template for displaying the product list
    }
}

