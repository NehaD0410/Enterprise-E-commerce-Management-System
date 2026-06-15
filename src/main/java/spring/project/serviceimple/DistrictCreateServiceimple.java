package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.District;
import spring.project.repository.DistrictRepository;
import spring.project.service.DistrictCreateService;

@Service
public class DistrictCreateServiceimple implements DistrictCreateService {
	private final DistrictRepository districtRepository;

	public DistrictCreateServiceimple(DistrictRepository districtRepository) {
		super();
		this.districtRepository = districtRepository;
	}

	@Override
	public District addDistrict(District district) {
		District savedDistrict = districtRepository.save(district);
		return savedDistrict;
	}

}
