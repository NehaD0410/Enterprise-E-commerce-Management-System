package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Town;
import spring.project.repository.TownRepository;
import spring.project.service.TownFetchService;
@Service
public class TownFetchServiceimple implements TownFetchService{

	private final TownRepository townRepository;
	public TownFetchServiceimple(TownRepository townRepository) {
		super();
		this.townRepository = townRepository;
	}
	@Override
	public List<Town> getTowns() {
		// TODO Auto-generated method stub
		return townRepository.findAll();
	}
	@Override
	public Town GetTownByid(int id) {
		// TODO Auto-generated method stub
		return townRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Town not found with id: " + id));
	}
	
	
	

}
