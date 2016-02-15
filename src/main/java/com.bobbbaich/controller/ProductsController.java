package com.bobbbaich.controller;

import com.bobbbaich.model.ProductCard;
import com.bobbbaich.model.ProductType;
import com.bobbbaich.service.ProductCardService;
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

    @Autowired(required = false)
    private ProductCardService productCardService;

    @RequestMapping(method = RequestMethod.GET)
    public String showAllProducts(ModelMap model) {
        List<ProductCard> productCards = productCardService.findAllProductCards();
        model.addAttribute("productCards", productCards);
        return "productlist";
    }

    @RequestMapping(value = "/belt", method = RequestMethod.GET)
    public String showBelt(ModelMap model) {
        List<ProductCard> productCards = productCardService.findProductCardsByProductType(ProductType.BELT);
        model.addAttribute("productCards", productCards);
        return "productlist";
    }

    @RequestMapping(value = "/cap", method = RequestMethod.GET)
    public String showCap(ModelMap model) {
        List<ProductCard> productCards = productCardService.findProductCardsByProductType(ProductType.CAP);
        model.addAttribute("productCards", productCards);
        return "productlist";
    }

    @RequestMapping(value = "/t_shirt", method = RequestMethod.GET)
    public String showTshirt(ModelMap model) {
        List<ProductCard> productCards = productCardService.findProductCardsByProductType(ProductType.T_SHIRT);
        model.addAttribute("productCards", productCards);
        return "productlist";
    }

    @RequestMapping(value = "/rashgard", method = RequestMethod.GET)
    public String showRashgard(ModelMap model) {
        List<ProductCard> productCards = productCardService.findProductCardsByProductType(ProductType.RASHGARD);
        model.addAttribute("productCards", productCards);
        return "productlist";
    }

//    @RequestMapping(value = "/ammunition", method = RequestMethod.GET)
//    public String showAmmunition(ModelMap model) {
//        List<ProductCard> productCards = productCardService.findProductCardsByProductType(ProductType.AMMUNITION);
//        model.addAttribute("productCards", productCards);
//        return "productlist";
//    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    public String showItem(@PathVariable Long id , ModelMap model){
        model.addAttribute("item", productCardService.findProductCardById(id));
        return "item";
    }

    @RequestMapping(value = "/gi", method = RequestMethod.GET)
    public String showGi(ModelMap model) {
        List<ProductCard> productCards = productCardService.findProductCardsByProductType(ProductType.GI);
        model.addAttribute("productCards", productCards);
//        Set<ProductSize> productSizes = productCards.stream().map(Product::getProductSize).collect(Collectors.toSet());
//        List<ProductSize> sizes = getSizes(productSizes);
//        System.out.println(sizes.get(0));
//        model.addAttribute("sizes", sizes);
        return "productlist";
    }

//    private List<ProductSize> getSizes(Set<ProductSize> productSizes) {
//        List<ProductSize> sizes = new ArrayList<>();
//        Iterator<ProductSize> iterator = productSizes.iterator();
//        while (iterator.hasNext()){sizes.add(iterator.next());}
//        Collections.sort(sizes);
//        return sizes;
//    }
//
//    private void getSizes(){
//        Map<ProductSize, Integer> map = new EnumMap<>();
//        for (int i = 0; i < map.size(); i++) {
//        }
//
}

