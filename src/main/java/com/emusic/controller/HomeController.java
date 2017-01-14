package com.emusic.controller;

import com.emusic.dao.ProductDAO;
import com.emusic.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by gazi_opu on 1/15/2017.
 */
@Controller
public class HomeController {

    ProductDAO productDAO = new ProductDAO();
    @RequestMapping("/")
    public String home(){
        return  "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model){
//        List<Product> productList = productDAO.getProductList();


//        Product product = productList.get(0);
//        model.addAttribute(product);

        List<Product> products = productDAO.getProductList();
        model.addAttribute("products",products);

        return "productList";

    }

    @RequestMapping("productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException {

        Product product = productDAO.getProductById(productId);
        model.addAttribute(product);

        return "viewProduct";
    }


}
