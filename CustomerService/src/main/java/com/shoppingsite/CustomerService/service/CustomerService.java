package com.shoppingsite.CustomerService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.shoppingsite.CustomerService.model.ProductModel;

@Service
public class CustomerService {
	@Autowired
	RestTemplate restTemplate; 
	
	@Value("${test.url}")
	private String testUrl;
	
	
	public ProductModel getProductById(Long id) {
		
		ProductModel p = restTemplate.getForObject(testUrl+"/getproductById/"+id, ProductModel.class);
		return new ProductModel(p.getId(),p.getName(),p.getDescription(),p.getProductModel(),p.getPrice());
		
		
	}

	public ProductModel[] getProductByName(String name) {
		 ResponseEntity<ProductModel[]> p = restTemplate.getForEntity(testUrl+"/getproductByName/"+name, ProductModel[].class);
		
		 return p.getBody();	
		 }
	
	
	public ProductModel[] getAllProducts() {
		ResponseEntity<ProductModel[]> p = restTemplate.getForEntity(testUrl+"/getAllProducts", ProductModel[].class);
		 return p.getBody();	
		
	}
	
}
