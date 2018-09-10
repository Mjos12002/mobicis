package com.mobivat.mobivat_is.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobivat.mobivat_is.entity.*;
import com.mobivat.mobivat_is.model.ProductOrderModel;
import com.mobivat.mobivat_is.model.SaleModel;
import jdk.nashorn.internal.ir.ObjectNode;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class SaleController {

    @Autowired
    SaleModel saleModel;
    @Autowired
    ProductOrderModel productOrderModel;

    @RequestMapping(value = "/check_product_code", produces = "application/json")
    public List<ProductEntity> checkProductCode(@ModelAttribute SaleRequestEntity saleRequestEntity, Model model){
        return saleModel.getProductDetails(saleRequestEntity.getProductCode());
    }

    @RequestMapping(value = "/process_order_data", method = RequestMethod.POST, produces = "application/json")
    public GenericResponse processOrderData(@RequestParam(name = "data") String data){
        String productID[] = data.split("_");
        ProductOrderDetailEntity productOrderDetailEntity;
        GenericResponse genericResponse = null;
        for(int i = 0; i < productID.length; i ++){
            productOrderDetailEntity = new ProductOrderDetailEntity(1, "ibirayi", 100, 1200, 1, 10, "VAT");
            genericResponse = productOrderModel.persistProductOrderDetailData(productOrderDetailEntity);
        }
        ProductOrderTotalEntity productOrderTotalEntity;
        productOrderTotalEntity = new ProductOrderTotalEntity(1, 1, "2018-1-1", 1000);
        int lastRecordID = productOrderModel.persistOrderTotalData(productOrderTotalEntity);
        return genericResponse;
    }

    @RequestMapping(value = "create_json", produces = "application/json")
    public String createSalesJSON(){

        List<ProductEntity> productEntities = new ArrayList<>();
        productEntities.add(new ProductEntity(1, 1, "Amandazi", 12, 1, "123"));
        productEntities.add(new ProductEntity(1, 1, "Ibirayi", 12, 1, "123"));
        productEntities.add(new ProductEntity(1, 1, "Ibirayi", 12, 1, "123"));

        InternalDataRequestJSON internalDataRequestJSON = new InternalDataRequestJSON(productEntities, new CompanyDetails("Simba", "Kigali", "1234", "07888"), new CustomerEntity("078888", "1234", "Name"), new AmountPaidEntity(122));
        ObjectMapper objectMapper = new ObjectMapper();
        String response = "";
        ResponseEntity<String> serverResponse = null;
        String x = "None";
        try {
            response = objectMapper.writeValueAsString(internalDataRequestJSON);
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
            requestBody.add("data", response);
            HttpEntity formEntity = new HttpEntity<MultiValueMap<String, String>>(requestBody, headers);
            serverResponse =
                    restTemplate.exchange("http://dev.mobivat.com:8080/api/vsdc/test/request", HttpMethod.POST,
                            formEntity, String.class);
            response = serverResponse.getBody();
            response += formEntity.toString();
            x += serverResponse.getBody();
        }catch (Exception ex){
            response = ex.getMessage();
        }
//        ResponseEntity<String> serverResponse = null;
//        try {
//            RestTemplate restTemplate = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
//            requestBody.add("data", response);
//            HttpEntity formEntity = new HttpEntity<MultiValueMap<String, String>>(requestBody, headers);
//            serverResponse =
//                    restTemplate.exchange("http://dev.mobivat.com:8080/api/vsdc/test/request", HttpMethod.POST,
//                            formEntity, String.class);
//            response = serverResponse.getBody();
//        }catch (Exception ex){
//            response = ex.getMessage();
//            System.out.println(ex.getMessage());
//        }

        return x;

    }

}
