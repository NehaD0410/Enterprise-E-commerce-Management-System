package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Taluka;
import spring.project.repository.TalukaRepository;
import spring.project.service.TalukaUpdateService;
@Service
public class TalukaUpdateServiceimple implements TalukaUpdateService{

	private final TalukaRepository talukaRepository;
	public TalukaUpdateServiceimple(TalukaRepository talukaRepository) {
		super();
		this.talukaRepository = talukaRepository;
	}
	@Override
	public Taluka updateTaluka(int id, Taluka taluka) {
		// TODO Auto-generated method stub
		Taluka existingTaluka=talukaRepository.findById(id).orElseThrow(() -> new RuntimeException("Taluka not found with id: " + id));
		existingTaluka.setName(taluka.getName());
		return talukaRepository.save(existingTaluka);
	}

}
