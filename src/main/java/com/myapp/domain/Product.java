package com.myapp.domain;

/**
 * Created by scelac on 3/22/16.
 */
import javax.persistence.*;
@Entity
@Table(name = "Products")
public class Product
{
    @Id
    @GeneratedValue
    @Column(name="productId")
    private int productId;

    @Column(name="productName")
    private String productName;

    @Column(name="productCount")
    private int productCount;

    @Column(name="productPrice")
    private float productPrice;

    @Column(name="productDescription")
    private String productDescription;

    public Product()
    {

    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
