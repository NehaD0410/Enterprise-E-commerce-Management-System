package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.TalukaRepository;
import spring.project.service.TalukaDeleteService;
@Service
public class TalukaDeleteServiceimple implements TalukaDeleteService{

	private final TalukaRepository talukaRepository;
	public TalukaDeleteServiceimple(TalukaRepository talukaRepository) {
		super();
		this.talukaRepository = talukaRepository;
	}
	@Override
	public void deleteTaluka(int id) {
		// TODO Auto-generated method stub
		talukaRepository.deleteById(id);
	}

}
