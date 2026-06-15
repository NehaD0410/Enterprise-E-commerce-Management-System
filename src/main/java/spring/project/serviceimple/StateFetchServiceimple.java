package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.State;
import spring.project.repository.StateRepository;
import spring.project.service.StateFetchService;

@Service
public class StateFetchServiceimple implements StateFetchService {
	private final StateRepository stateRepository;

	public StateFetchServiceimple(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public List<State> getStates() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

	@Override
	public State getStateByid(int id) {
		// TODO Auto-generated method stub
		return stateRepository.findById(id).orElseThrow(() -> new RuntimeException("State not found with id: " + id));
	}

}
