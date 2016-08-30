
package com.packt.webspringstore.service.impl;

import com.packt.webspringstore.service.OrderService;
import org.springframework.stereotype.Service;
import com.packt.webspringstore.domain.Product;
import com.packt.webspringstore.domain.repository.ProductRepository;
import com.packt.webspringstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private ProductRepository productRepository;
    
    /**
     *
     * @param productId
     * @param quantity
     */
    @Override
    public void processOrder(String productId, long quantity) {
        Product productById = productRepository.getProductById(productId);
        
        if(productById.getUnitsInStock() < quantity){
            throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
        }
        
        productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
    }
    
}
