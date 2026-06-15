package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.State;
import spring.project.repository.StateRepository;
import spring.project.service.StateCreateService;

@Service
public class StateCreateServiceimple implements StateCreateService {

	private final StateRepository stateRepository;

	public StateCreateServiceimple(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public State addState(State state) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}

}
