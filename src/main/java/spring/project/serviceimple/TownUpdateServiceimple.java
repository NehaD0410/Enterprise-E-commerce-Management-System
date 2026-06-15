package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Town;
import spring.project.repository.TownRepository;
import spring.project.service.TownUpdateService;
@Service
public class TownUpdateServiceimple implements TownUpdateService{
  
	private final TownRepository townRepository ;
		
	public TownUpdateServiceimple(TownRepository townRepository) {
		super();
		this.townRepository = townRepository;
	}


	@Override
	public Town updateTown(int id, Town town) {
		// TODO Auto-generated method stub
		Town existingTown = townRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Town not found with id: " + id));
				 existingTown.setName(town.getName());
		return townRepository.save(existingTown);
	}

}
