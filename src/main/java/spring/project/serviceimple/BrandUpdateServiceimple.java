package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Brand;
import spring.project.repository.BrandRepository;
import spring.project.service.BrandUpdateService;

@Service
public class BrandUpdateServiceimple implements BrandUpdateService {

	private final BrandRepository brandRepository;

	public BrandUpdateServiceimple(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public Brand updateBrand(int id, Brand brand) {
		// TODO Auto-generated method stub
		Brand existingBrand = brandRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Brand not found with id: " + id));
		existingBrand.setName(brand.getName());
		return brandRepository.save(existingBrand);

	}

}