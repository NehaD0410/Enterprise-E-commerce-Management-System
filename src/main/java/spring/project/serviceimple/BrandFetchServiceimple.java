package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Brand;
import spring.project.repository.BrandRepository;
import spring.project.service.BrandFetchService;

@Service
public class BrandFetchServiceimple implements BrandFetchService {

	private final BrandRepository brandRepository;

	public BrandFetchServiceimple(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getBrands() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

	@Override
	public Brand getBrandByid(int id) {
		// TODO Auto-generated method stub
		return brandRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id: " + id));
	}

}