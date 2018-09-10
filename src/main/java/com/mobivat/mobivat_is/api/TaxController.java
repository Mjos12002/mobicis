package com.mobivat.mobivat_is.api;

import com.mobivat.mobivat_is.entity.GenericResponse;
import com.mobivat.mobivat_is.entity.TaxEntity;
import com.mobivat.mobivat_is.model.TaxModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class TaxController {

    @Autowired
    TaxModel taxModel;

    @RequestMapping(value = "/tax_type.create", method = RequestMethod.POST, produces = "application/json")
    public GenericResponse createTaxType(@ModelAttribute TaxEntity taxEntity, Model model){
        return taxModel.persistTaxData(taxEntity);
    }
}
