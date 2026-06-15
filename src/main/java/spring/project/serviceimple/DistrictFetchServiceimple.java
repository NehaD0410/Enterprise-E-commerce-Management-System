package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.District;
import spring.project.repository.DistrictRepository;
import spring.project.service.DistrictFetchService;

@Service
public class DistrictFetchServiceimple implements DistrictFetchService {
	private DistrictRepository districtRepository;

	public DistrictFetchServiceimple(DistrictRepository districtRepository) {
		super();
		this.districtRepository = districtRepository;
	}

	@Override
	public List<District> getDistricts() {
		// TODO Auto-generated method stub
		return districtRepository.findAll();
	}

	@Override
	public District getDistrictfindbyid(int id) {
		// TODO Auto-generated method stub
		return districtRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("District not found with id: " + id));
	}

}
