package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Taluka;
import spring.project.repository.TalukaRepository;
import spring.project.service.TalukaFetchAllService;
@Service
public class TalukaFetchAllServiceimple implements TalukaFetchAllService{

	private final TalukaRepository talukaRepository;
	public TalukaFetchAllServiceimple(TalukaRepository talukaRepository) {
		super();
		this.talukaRepository = talukaRepository;
	}
	@Override
	public List<Taluka> getAllTalukas() {
		// TODO Auto-generated method stub
		return talukaRepository.findAll();
	}

}
