package com.mobivat.mobivat_is.model;

import com.mobivat.mobivat_is.entity.GenericResponse;
import com.mobivat.mobivat_is.entity.ProductCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class ProductCategoryModel {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public ProductCategoryModel(){}

    public GenericResponse persistProductCategories(ProductCategoryEntity productCategoryEntity){

        GenericResponse genericResponse;
        int recordID = 0;
        String sql = "INSERT INTO mv_product_categories values (?, ?, ?, ?)";
        RedirectView redirectView = new RedirectView();
        try{
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public java.sql.PreparedStatement createPreparedStatement(java.sql.Connection connection) throws SQLException {
                    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    preparedStatement.setString(1, null);
                    preparedStatement.setString(2, productCategoryEntity.getCategoryName());
                    preparedStatement.setInt(3, productCategoryEntity.getCategoryTaxTypeID());
                    preparedStatement.setString(4, productCategoryEntity.getDateCreated());
                    return preparedStatement;
                }
            }, keyHolder);
            recordID = keyHolder.getKey().intValue();
            genericResponse = new GenericResponse(String.valueOf(recordID), "Product category data added successfully", "Success", "200");

        }catch (Exception ex){
            genericResponse = new GenericResponse(String.valueOf(0), ex.getMessage(), "Error", "300");
        }
        return genericResponse;

    }


}
