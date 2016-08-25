/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packt.webspringstore.domain.repository;

import com.packt.webspringstore.domain.Product;
import java.util.List;

/**
 *
 * @author nemus
 */
public interface ProductRepository {
    List<Product> getAllProducts();
}
