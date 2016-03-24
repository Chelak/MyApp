package com.myapp.service.product;

import com.myapp.dao.product.ProductDAO;
import com.myapp.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by scelac on 3/22/16.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    @Transactional
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    @Transactional
    public Product findById(Integer productId) {
        return productDAO.findById(productId);
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    @Override
    @Transactional
    public void editProduct(Product product, Integer productId) {
        productDAO.editProduct(product,productId);
    }

    @Override
    @Transactional
    public void removeProduct(Integer productId) {
        productDAO.removeProduct(productId);
    }
}
