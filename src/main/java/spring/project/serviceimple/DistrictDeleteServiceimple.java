package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.DistrictRepository;
import spring.project.service.DistrictDeleteService;

@Service
public class DistrictDeleteServiceimple implements DistrictDeleteService {
	private DistrictRepository districtRepository;

	public DistrictDeleteServiceimple(DistrictRepository districtRepository) {
		super();
		this.districtRepository = districtRepository;
	}

	@Override
	public void DeleteDistrict(int id) {
		// TODO Auto-generated method stub
		districtRepository.deleteById(id);
	}
}
