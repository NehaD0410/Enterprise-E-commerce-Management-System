package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Brand;
import spring.project.repository.BrandRepository;
import spring.project.service.BrandCreateService;

@Service
public class BrandCreateServiceimple implements BrandCreateService {

	private final BrandRepository brandRepository;

	public BrandCreateServiceimple(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public Brand AddBrand(Brand brand) {
		// TODO Auto-generated method stub
		Brand savedBrand = brandRepository.save(brand);
		return savedBrand;

	}

}