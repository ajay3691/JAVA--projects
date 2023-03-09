package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	// CRud Operations
	
	// Create Product
	public void saveProduct(Product product) {
		productRepo.save(product);
	}
	//Get All products
	public  List<Product> getProducts(){
		return productRepo.findAll();
		//return productRepo.findById(null);
	}
	//update Product
	public void updateProduct(Product product){
		productRepo.save(product);
	}
	// delete product
	public void deleteProduct(Integer id) {
		productRepo.deleteById(id);
	}
	

}
