package com.myapp.dao.product;

import com.myapp.domain.Product;

import java.util.List;

/**
 * Created by scelac on 3/22/16.
 */
public interface ProductDAO
{
    public List<Product> findAll();
    public Product findById(Integer productId);
    public void addProduct(Product product);
    public void editProduct(Product product, Integer productId);
    public void removeProduct(Integer productId);
}
