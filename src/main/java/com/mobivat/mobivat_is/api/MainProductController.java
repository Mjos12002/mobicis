package com.mobivat.mobivat_is.api;

import com.mobivat.mobivat_is.entity.GenericResponse;
import com.mobivat.mobivat_is.entity.MainProductEntity;
import com.mobivat.mobivat_is.model.MainProductModel;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MainProductController {

    @Autowired
    MainProductModel mainProductModel;
    @RequestMapping(value = "/main_product.create", method = RequestMethod.POST)
    public GenericResponse createMainProduct(@ModelAttribute MainProductEntity mainProductEntity){
        return mainProductModel.persistMainProductData(mainProductEntity);
    }
}
