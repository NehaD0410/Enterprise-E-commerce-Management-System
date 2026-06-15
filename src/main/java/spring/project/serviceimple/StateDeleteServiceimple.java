package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.StateRepository;
import spring.project.service.StateDeleteService;

@Service
public class StateDeleteServiceimple implements StateDeleteService {
	private final StateRepository stateRepository;

	public StateDeleteServiceimple(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public void DeleteState(int id) {
		// TODO Auto-generated method stub
		stateRepository.deleteById(id);
	}

}
