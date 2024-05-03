package com.demo.service;

import com.demo.payload.ProductsAPIResponse;
import com.demo.payload.ProductsResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ProductsService {

    private final String PRODUCTS_URL = "https://dummyjson.com/products/";

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<ProductsResponseDTO> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        ProductsAPIResponse result = restTemplate.getForObject(PRODUCTS_URL, ProductsAPIResponse.class);
       // return new ResponseEntity<>(result, HttpStatus.OK);
        System.out.println(result);
        return null;
    }
}
