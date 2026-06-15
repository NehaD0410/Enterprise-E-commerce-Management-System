package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Product;
import spring.project.repository.ProductRepository;
import spring.project.service.ProductFetchService;

@Service
public class ProductFetchServiceimple implements ProductFetchService {

	private final ProductRepository productRepository;

	public ProductFetchServiceimple(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductByid(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("product not found with id: " + id));
	}

}