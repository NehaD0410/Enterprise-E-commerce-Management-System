package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.State;
import spring.project.repository.StateRepository;
import spring.project.service.StateFetchAllService;

@Service
public class StateFetchAllServiceImple implements StateFetchAllService {
	private final StateRepository stateRepository;

	public StateFetchAllServiceImple(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public List<State> getAllStates() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();

	}

}
