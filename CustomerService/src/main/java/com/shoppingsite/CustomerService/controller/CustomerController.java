package com.shoppingsite.CustomerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingsite.CustomerService.model.ProductModel;
import com.shoppingsite.CustomerService.service.CustomerService;


@RestController
public class CustomerController{
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/productsById/{id}")
	public ProductModel getProductById(@PathVariable(value = "id") long id) {
		return customerService.getProductById(id);
	}
	
	
	@GetMapping("/productsByName/{name}")
	public	ProductModel[] getProductByName(@PathVariable(value = "name") String name) {
		return customerService.getProductByName(name);
	}
	
	
	@GetMapping("/productsAll")
	public ProductModel[] getAllProducts() {
		return customerService.getAllProducts();
	}
}