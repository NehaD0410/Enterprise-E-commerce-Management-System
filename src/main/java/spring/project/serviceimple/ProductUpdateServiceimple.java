package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Product;
import spring.project.repository.ProductRepository;
import spring.project.service.ProductUpdateService;

@Service
public class ProductUpdateServiceimple implements ProductUpdateService {

	private final ProductRepository productRepository;

	public ProductUpdateServiceimple(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		Product existingProduct = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("product not found with id: " + id));
		existingProduct.setName(product.getName());
		return productRepository.save(existingProduct);

	}

}