package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Product;
import spring.project.repository.ProductRepository;
import spring.project.service.ProductCreateService;

@Service
public class ProductCreateServiceimple implements ProductCreateService {

	private final ProductRepository productRepository;

	public ProductCreateServiceimple(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub

		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}

}