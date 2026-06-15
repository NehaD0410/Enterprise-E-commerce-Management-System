package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.District;
import spring.project.repository.DistrictRepository;
import spring.project.service.DistrictUpdateService;

@Service
public class DistrictUpdateServiceimple implements DistrictUpdateService {
	private final DistrictRepository districtRepository;

	public DistrictUpdateServiceimple(DistrictRepository districtRepository) {
		super();
		this.districtRepository = districtRepository;
	}

	@Override
	public District UpdateDistrict(int id, District district) {
		// TODO Auto-generated method stub
		District existingDistrict = districtRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("District not found with id: " + id));
		existingDistrict.setName(district.getName());
		return districtRepository.save(existingDistrict);
	}

}
