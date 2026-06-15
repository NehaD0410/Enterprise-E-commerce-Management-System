package spring.project.service;

import java.util.List;

import spring.project.entity.Product;

public interface ProductFetchService {
List<Product>getProducts();
Product getProductByid(int id);
}
