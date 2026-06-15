package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Taluka;
import spring.project.repository.TalukaRepository;
import spring.project.service.TalukaCreateService;
@Service
public class TalukaCreateServiceimple implements TalukaCreateService{

	private final TalukaRepository talukaRepository;
	public TalukaCreateServiceimple(TalukaRepository talukaRepository) {
		super();
		this.talukaRepository = talukaRepository;
	}
	@Override
	public Taluka addTaluka(Taluka taluka) {
		// TODO Auto-generated method stub
		Taluka savedTaluka=talukaRepository.save(taluka);
		return savedTaluka;
	}

}
