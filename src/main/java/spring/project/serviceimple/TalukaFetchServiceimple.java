package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Taluka;
import spring.project.repository.TalukaRepository;
import spring.project.service.TalukaFetchService;
@Service
public class TalukaFetchServiceimple implements TalukaFetchService{

	private final TalukaRepository talukaRepository;
	public TalukaFetchServiceimple(TalukaRepository talukaRepository) {
		super();
		this.talukaRepository = talukaRepository;
	}

	@Override
	public List<Taluka> getTalukas() {
		// TODO Auto-generated method stub
		return talukaRepository.findAll();
	}

	@Override
	public Taluka getTalukaByid(int id) {
		// TODO Auto-generated method stub
		return talukaRepository.findById(id).orElseThrow(() -> new RuntimeException("Taluka not found with id: " + id));
	}

}
