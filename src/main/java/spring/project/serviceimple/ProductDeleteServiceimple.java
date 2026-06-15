package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.ProductRepository;
import spring.project.service.ProductDeleteService;

@Service
public class ProductDeleteServiceimple implements ProductDeleteService {

	private final ProductRepository productRepository;

	public ProductDeleteServiceimple(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void DeleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

}