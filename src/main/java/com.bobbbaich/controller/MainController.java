package com.bobbbaich.controller;

import com.bobbbaich.model.ProductCard;
import com.bobbbaich.service.ProductCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 06.02.2016.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private ProductCardService productCardService;

    @RequestMapping(value = {"/home", "/"},method = RequestMethod.GET)
    public String home(ModelMap model){
        List<ProductCard> productCards = productCardService.findAllProductCards();
        model.addAttribute("productCards", productCards);
        return "productlist";
    }
}
