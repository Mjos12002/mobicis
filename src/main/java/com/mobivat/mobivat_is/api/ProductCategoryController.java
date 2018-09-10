package com.mobivat.mobivat_is.api;

import com.mobivat.mobivat_is.entity.GenericResponse;
import com.mobivat.mobivat_is.entity.ProductCategoryEntity;
import com.mobivat.mobivat_is.model.ProductCategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.net.www.content.text.Generic;

import javax.jws.WebParam;

@RestController
@RequestMapping("/api")
public class ProductCategoryController {

    @Autowired
    ProductCategoryModel productCategoryModel;
    @RequestMapping(value = "/product_category.create", method = RequestMethod.POST)
    public GenericResponse addProductCategory(@ModelAttribute ProductCategoryEntity productCategoryEntity, Model model){

        return productCategoryModel.persistProductCategories(productCategoryEntity);
    }

}
