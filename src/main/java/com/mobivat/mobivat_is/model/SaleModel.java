package com.mobivat.mobivat_is.model;

import com.mobivat.mobivat_is.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SaleModel {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<ProductEntity> getProductDetails(String barCode){

        List<ProductEntity> result;
        try {
            result = jdbcTemplate.query(
                    "SELECT ip_products.product_id, ip_products.product_name, ip_products.product_price, mv_tax_type.tax_name, mv_tax_type.tax_value FROM ip_products, mv_product_categories, mv_tax_type WHERE mv_tax_type.id = mv_product_categories.category_tax_type_id AND ip_products.family_id = mv_product_categories.id AND ip_products.bar_code = ?",
                    (rs, rowNum) -> new ProductEntity(rs.getInt("product_id"), 0, rs.getString("product_name"), rs.getInt("product_price"), rs.getInt("tax_value"), rs.getString("tax_name")),
                    new Object[]{barCode}

            );
        }catch (Exception ex){
            result = new ArrayList<ProductEntity>(){
                {
                    add(new ProductEntity(0, 0, "None", 0, 0, "None"));
                }
            };
        }
        return result;
    }

}
