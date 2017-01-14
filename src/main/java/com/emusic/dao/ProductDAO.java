package com.emusic.dao;


import com.emusic.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by gazi_opu on 1/15/2017.
 */
public class ProductDAO {

    private List<Product> productList;

    public List<Product> getProductList(){

        Product product = new Product();

        product.setProductId("P123");

        product.setProductName("Guitar");
        product.setProductCategory("Instrument");
        product.setProductDescription("This is a fender Star Guitar");
        product.setProductPrice(2000);
        product.setProductCondition("New");
        product.setUnitInStock(45);
        product.setProductMenufacturer("Fender");

        Product product1 = new Product();

        product1.setProductId("P124");
        product1.setProductName("Rock Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is awesome mix of 20th century");
        product1.setProductPrice(10000);
        product1.setProductCondition("New");
        product1.setUnitInStock(47);
        product1.setProductMenufacturer("Fender");


        Product product2 = new Product();

        product2.setProductId("P125");
        product2.setProductName("Electric Guitar ");
        product2.setProductCategory("Instrument");
        product2.setProductDescription("This is a fender Star Electric Guitar");
        product2.setProductPrice(2500);
        product2.setProductCondition("New");
        product2.setUnitInStock(40);
        product2.setProductMenufacturer("Fender");




        Product product3 = new Product();

        product3.setProductId("P126");
        product3.setProductName("Speaker");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is a Polk Self Speaker");
        product3.setProductPrice(5000);
        product3.setProductCondition("New");
        product3.setUnitInStock(25);
        product3.setProductMenufacturer("Polk");

        productList = new ArrayList<Product>();

        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);



        return productList;
    }

    public Product getProductById(String prductId) throws IOException {
        for(Product product : getProductList()){
            if(product.getProductId().equals(prductId)){
                return  product;
            }
        }
        throw new IOException("No Product Found");
    }
}
