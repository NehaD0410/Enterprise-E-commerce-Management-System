package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Product;
import spring.project.repository.ProductRepository;
import spring.project.service.ProductFetchAllService;

@Service
public class ProductFetchAllServiceImple implements ProductFetchAllService {

	private final ProductRepository productRepository;

	public ProductFetchAllServiceImple(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub

		return productRepository.findAll();
	}

}