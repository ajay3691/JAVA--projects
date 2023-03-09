package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	//perform - crud operation
		@Autowired
		private ProductRepository productRepo;
		
		//get all product 
		public List<Product> getProducts(){
			return productRepo.findAll();
		}
		
		//create product
		public void save(Product product) {
			productRepo.save(product);
		}
		//get single product
		public Product getProduct(Integer id) {
			return productRepo.findById(id).get();
		}
		//update product
		//delete product
		public void deleteProduct(Integer id) {
			productRepo.deleteById(id);
		}
	
}
