package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.BrandRepository;
import spring.project.service.BrandDeleteService;

@Service
public class BrandDeleteServiceimple implements BrandDeleteService {

	private final BrandRepository brandRepository;

	public BrandDeleteServiceimple(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public void deleteBrand(int id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
	}

}