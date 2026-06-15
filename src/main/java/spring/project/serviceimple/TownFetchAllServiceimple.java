package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Town;
import spring.project.repository.TownRepository;
import spring.project.service.TownFetchAllService;

@Service
public class TownFetchAllServiceimple implements TownFetchAllService {

	private final TownRepository townRepository;

	public TownFetchAllServiceimple(TownRepository townRepository) {
		super();
		this.townRepository = townRepository;
	}

	@Override
	public List<Town> getAllTowns() {
		// TODO Auto-generated method stub
		return townRepository.findAll();
	}

}
