package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.State;
import spring.project.repository.StateRepository;
import spring.project.service.StateUpdateService;

@Service
public class StateUpdateServiceimple implements StateUpdateService {
	private final StateRepository stateRepository;

	public StateUpdateServiceimple(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public State updateState(int id, State state) {
		// TODO Auto-generated method stub
		State existingState = stateRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("State not found with id: " + id));
		existingState.setName(state.getName());
		return stateRepository.save(existingState);
	}

}
