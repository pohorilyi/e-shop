package com.bobbbaich.controller;

import com.bobbbaich.model.Product;
import com.bobbbaich.model.ProductType;
import com.bobbbaich.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 16.01.2016.
 */
@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String showAllProducts(ModelMap model) {
        List<Product> products = productService.findAllProducts();
        model.addAttribute("products", products);
        return "main";
    }

    @RequestMapping(value = "/{productType}", method = RequestMethod.GET)
    public String showProductsByType(@PathVariable ProductType productType, ModelMap model) {
        List<Product> products = productService.findProductsByProductType(productType);
        model.addAttribute("products", products);
        return "main";
    }

}