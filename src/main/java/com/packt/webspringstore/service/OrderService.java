/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packt.webspringstore.service;

/**
 *
 * @author nemus
 */
public interface OrderService {
    
    void processOrder(String productId, long quantity);
}
