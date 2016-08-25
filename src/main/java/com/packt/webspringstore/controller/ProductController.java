
package com.packt.webspringstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webspringstore.domain.Product;
import com.packt.webspringstore.domain.repository.ProductRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ProductController {
    
   @Autowired
   private ProductRepository productRepository;
    
    @RequestMapping("/products")
    public String list(Model model){
        
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
}
