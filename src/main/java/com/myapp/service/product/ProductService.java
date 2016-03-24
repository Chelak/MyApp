package com.myapp.service.product;

import com.myapp.domain.Product;

import java.util.List;

/**
 * Created by scelac on 3/22/16.
 */
public interface ProductService
{
    public List<Product> findAll();
    public Product findById(Integer productId);
    public void addProduct(Product product);
    public void editProduct(Product product, Integer productId);
    public void removeProduct(Integer productId);
}
