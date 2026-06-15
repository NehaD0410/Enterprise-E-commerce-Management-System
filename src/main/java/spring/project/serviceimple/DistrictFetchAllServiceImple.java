package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.District;
import spring.project.repository.DistrictRepository;
import spring.project.service.DistrictFetchAllService;

@Service
public class DistrictFetchAllServiceImple implements DistrictFetchAllService {
	private DistrictRepository districtRepository;

	public DistrictFetchAllServiceImple(DistrictRepository districtRepository) {
		super();
		this.districtRepository = districtRepository;
	}

	@Override
	public List<District> getAllDistricts() {
		// TODO Auto-generated method stub
		return districtRepository.findAll();
	}

}
