package spring.project.serviceimple;


import org.springframework.stereotype.Service;

import spring.project.entity.Town;
import spring.project.repository.TownRepository;
import spring.project.service.TownCreateService;
@Service
public class TownCreateServiceimple implements TownCreateService{
	
	private final TownRepository townRepository;
	
	public TownCreateServiceimple(TownRepository townRepository) {
		super();
		this.townRepository = townRepository;
	}
	
	
	
	@Override
	public Town addTown(Town town) {
		// TODO Auto-generated method stub
		 Town savedTown = townRepository.save(town);
	        
		return savedTown;
	}

}
