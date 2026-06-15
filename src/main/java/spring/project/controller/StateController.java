package spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.project.entity.State;
import spring.project.service.StateCreateService;
import spring.project.service.StateDeleteService;
import spring.project.service.StateFetchAllService;
import spring.project.service.StateFetchService;
import spring.project.service.StateUpdateService;

@RestController
@RequestMapping("/state")
public class StateController {
	@Autowired
	private final StateCreateService statecreateservice;
	@Autowired
	private final StateDeleteService statedeleteservice;
	@Autowired
	private final StateUpdateService stateupdateservice;
	@Autowired
	private final StateFetchService statefetchservice;
	@Autowired
	private final StateFetchAllService statefetchallservice;

	public StateController(StateCreateService statecreateservice, StateDeleteService statedeleteservice,
			StateUpdateService stateupdateservice, StateFetchService statefetchservice,
			StateFetchAllService statefetchallservice) {
		super();
		this.statecreateservice = statecreateservice;
		this.statedeleteservice = statedeleteservice;
		this.stateupdateservice = stateupdateservice;
		this.statefetchservice = statefetchservice;
		this.statefetchallservice = statefetchallservice;
	}

	@PostMapping
	public ResponseEntity<State> createState(@RequestBody State state) {
		State savedState = statecreateservice.addState(state);

		return new ResponseEntity<>(savedState, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<State>> getAllStates() {
		List<State> states = statefetchallservice.getAllStates();

		return ResponseEntity.ok(states);
	}

	@GetMapping("/{id}")
	public ResponseEntity<State> getStateById(@PathVariable int id) {
		State state = statefetchservice.getStateByid(id);

		return ResponseEntity.ok(state);
	}

	@PutMapping("/{id}")
	public ResponseEntity<State> updateState(@PathVariable int id, @RequestBody State stateDetails) {

		State updatedState = stateupdateservice.updateState(id, stateDetails);

		return ResponseEntity.ok(updatedState);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteState(@PathVariable int id) {

		statedeleteservice.DeleteState(id);

		return ResponseEntity.ok("State with ID " + id + " was deleted successfully.");
	}
}