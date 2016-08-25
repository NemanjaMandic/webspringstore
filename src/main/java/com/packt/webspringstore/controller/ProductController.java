
package com.packt.webspringstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webspringstore.domain.Product;
import java.math.BigDecimal;

@Controller
public class ProductController {
    
    @RequestMapping("/products")
    public String list(Model model){
        
        Product iphone = new Product("p1234", "iPhone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s smatrphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        
        model.addAttribute("product", iphone);
        return "products";
    }
}
