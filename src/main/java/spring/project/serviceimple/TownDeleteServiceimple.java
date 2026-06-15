package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.TownRepository;
import spring.project.service.TownDeleteService;
@Service
public class TownDeleteServiceimple implements TownDeleteService{

	private final TownRepository townRepository;
	public TownDeleteServiceimple(TownRepository townRepository) {
		super();
		this.townRepository = townRepository;
	}
	@Override
	public void DeleteTown(int id) {
		// TODO Auto-generated method stub
		townRepository.deleteById(id);
	}

}
