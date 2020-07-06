package cn.how2j.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.how2j.springcloud.client.ProductClientFeign;
import cn.how2j.springcloud.client.ProductClientRibbon;
import cn.how2j.springcloud.pojo.Product;

@Service
public class ProductService {
   
	 @Autowired
	 ProductClientRibbon productClientRibbon;
	 
	 @Autowired
	 ProductClientFeign  productClientFeign;
	 
	 public List<Product> listProducts(){
	      return productClientRibbon.listProdcuts();
	 
	  }
	 
	 public List<Product> feignProducts(){
		  return productClientFeign.listProdcuts();
	 }
}
