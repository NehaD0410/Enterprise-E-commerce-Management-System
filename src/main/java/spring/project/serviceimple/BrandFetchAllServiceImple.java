package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Brand;
import spring.project.repository.BrandRepository;
import spring.project.service.BrandFetchAllService;

@Service
public class BrandFetchAllServiceImple implements BrandFetchAllService {
	private final BrandRepository brandrepository;

	public BrandFetchAllServiceImple(BrandRepository brandrepository) {
		super();
		this.brandrepository = brandrepository;
	}

	@Override
	public List<Brand> brands() {
		// TODO Auto-generated method stub
		return brandrepository.findAll();
	}

}
