package com.myapp.controller;

import com.myapp.domain.Product;
import com.myapp.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by scelac on 3/22/16.
 */
@Controller
public class ProductController
{
    @Autowired
    ProductService productService;

    @RequestMapping( value = "/product", method = RequestMethod.GET)
    public String getAdminPage(ModelMap model)
    {
        model.addAttribute("message1", "Add Product");
        return "product";
    }

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("addProduct")Product product)
    {
//        modelMap.put("productName", product.getProductName());
//        modelMap.put("productDescription", product.getProductDescription());
//        modelMap.put("productCount", product.getProductCount());
//        modelMap.put("productPrice", product.getProductPrice());
        productService.addProduct(product);
        modelMap.put("addmessage", product.getProductName() + " added");
        return "index";
    }

    @RequestMapping(value = "/product-list", method = RequestMethod.GET)
    public ModelAndView getList() {
        List productList = productService.findAll();
        return new ModelAndView("index", "productList", productList);
    }


}
