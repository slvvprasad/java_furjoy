package com.furjoy.authentication.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.furjoy.authentication.pets.Pet;
import com.furjoy.authentication.products.Product;


@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/home")
	public String homeaut() {
		return "home";
	}
	@GetMapping("/roform")
	public String roform() {
		return "roform";
	}
	
	@GetMapping("/products.html")
	public String product() {
		return "products";
	}
	
	
	@GetMapping("/addproducts.html")
	public String showAddProductForm(Model model) {
	    model.addAttribute("newProduct", new Product());
	    return "addproducts";
	}
	
	 @GetMapping("/putadoptionform.html")
	    public String showAdoptionForm(Model model) {
	        model.addAttribute("newPet", new Pet()); // Assuming "Pet" is your entity class
	        return "putadoptionform"; // This should match the Thymeleaf template name
	    }
	 
	 @GetMapping("/adoptpetsdisplay.html")
		public String displaypets() {
			return "adoptpetsdisplay";
		}
	 
	 @GetMapping("/terms.html")
		public String terms() {
			return "terms";
		}
	 @GetMapping("/faqs.html")
		public String faqs() {
			return "faqs";
		}
	 
	 @GetMapping("/admin")
		public String adminpage() {
			return "admin";
		}
	
//	@GetMapping("/home")
//	public String index() {
//		return "index";
//	}
}