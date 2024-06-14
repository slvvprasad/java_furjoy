package com.furjoy.authentication.products;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
//        model.addAttribute("newProduct", new Product());
        return "products";
    }
    
  

    @PostMapping("/addproducts")
    public String addProduct(Product product) {
        productRepository.save(product);
        return "redirect:/products";
    }
    
}
    