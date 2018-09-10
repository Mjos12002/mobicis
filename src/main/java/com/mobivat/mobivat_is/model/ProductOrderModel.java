package com.mobivat.mobivat_is.model;

import com.mobivat.mobivat_is.entity.GenericResponse;
import com.mobivat.mobivat_is.entity.ProductOrderDetailEntity;
import com.mobivat.mobivat_is.entity.ProductOrderTotalEntity;
import org.json.JSONObject;
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
public class ProductOrderModel {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public GenericResponse persistProductOrderDetailData(ProductOrderDetailEntity productOrderEntity){

        GenericResponse genericResponse;
        int recordID = 0;
        String sql = "INSERT INTO mv_product_order_detail values (?, ?, ?, ?, ?, ?, ?, ?)";
        RedirectView redirectView = new RedirectView();
        try{
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public java.sql.PreparedStatement createPreparedStatement(java.sql.Connection connection) throws SQLException {
                    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    preparedStatement.setString(1, null);
                    preparedStatement.setInt(2,productOrderEntity.getProductID());
                    preparedStatement.setInt(3, 1);
                    preparedStatement.setInt(4, productOrderEntity.getUnitPrice());
                    preparedStatement.setInt(5, productOrderEntity.getTotalCost());
                    preparedStatement.setString(6, productOrderEntity.getVatType());
                    preparedStatement.setInt(7, productOrderEntity.getVatValue());
                    preparedStatement.setInt(8, 10);
                    return preparedStatement;
                }
            }, keyHolder);
            recordID = keyHolder.getKey().intValue();
            genericResponse = new GenericResponse(String.valueOf(recordID), "Main product data added successfully", "Success", "200");

        }catch (Exception ex){
            genericResponse = new GenericResponse(String.valueOf(0), ex.getMessage(), "Error", "300");
        }
        return genericResponse;
    }

    public int persistOrderTotalData(ProductOrderTotalEntity productOrderTotalEntity){

        int recordID = 0;
        String sql = "INSERT INTO mv_product_order_total values (?, ?, ?, ?, ?)";
        RedirectView redirectView = new RedirectView();
        try{
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public java.sql.PreparedStatement createPreparedStatement(java.sql.Connection connection) throws SQLException {
                    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    preparedStatement.setString(1, null);
                    preparedStatement.setInt(2,productOrderTotalEntity.getCustomerID());
                    preparedStatement.setInt(3, 1);
                    preparedStatement.setString(4, productOrderTotalEntity.getDate());
                    preparedStatement.setInt(5, productOrderTotalEntity.getTotalAmount());
                    return preparedStatement;
                }
            }, keyHolder);
            recordID = keyHolder.getKey().intValue();

        }catch (Exception ex){

        }
        return recordID;
    }




}
