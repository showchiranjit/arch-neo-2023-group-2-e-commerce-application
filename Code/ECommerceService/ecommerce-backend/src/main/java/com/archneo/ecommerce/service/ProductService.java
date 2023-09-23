package com.archneo.ecommerce.service;

import com.archneo.ecommerce.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> getAllProducts(String searchKeyword, Pageable pageable);

    Product getProductById(int productId);

    Product createProduct(Product product);

    Product updateProduct(int productId, Product product);

    void deleteProduct(int productId);
}