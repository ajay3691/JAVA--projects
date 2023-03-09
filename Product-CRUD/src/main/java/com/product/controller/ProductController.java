package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {
	
	//CRUD API
	
	@Autowired
	ProductService productService;

	/*
	 URL: localhost:8080/apis/product
	 Method:POSt
	 Required:id,name,price,qty,info
	*/
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}
	/*
	 URL: localhost:8080/apis/product
	 Method:Put
	 Required:id,name,price,qty,info
	 */
	@PutMapping("/product/{id}")
	public void updateProduct (@RequestBody Product product) {
		productService.updateProduct(product);
	} 
	/*@PutMapping("/product/{id}")
	public void updateProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}*/
	
	/*
	 URL: localhost:8080/apis/products
	 Method:GET
	 Required:None
	*/
	
	@GetMapping("/products")
	public List<Product> getProduct(){
		return productService.getProducts();
	} 
	/*
	 URL: localhost:8080/apis/products
	 Method:delete
	 Required:id */
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	} 
	
	

}
