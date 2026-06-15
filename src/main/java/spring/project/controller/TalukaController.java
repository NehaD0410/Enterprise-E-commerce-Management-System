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

import spring.project.entity.Taluka;
import spring.project.service.TalukaCreateService;
import spring.project.service.TalukaDeleteService;
import spring.project.service.TalukaFetchAllService;
import spring.project.service.TalukaFetchService;
import spring.project.service.TalukaUpdateService;

@RestController
@RequestMapping("/taluka")
public class TalukaController {
	@Autowired
	private final TalukaCreateService talukacreateservice;
	@Autowired
	private final TalukaDeleteService talukadeleteservice;
	@Autowired
	private final TalukaUpdateService talukaupdateservice;
	@Autowired
	private final TalukaFetchService talukafetchteservice;
	@Autowired
	private final TalukaFetchAllService talukafetchAllteservice;

	public TalukaController(TalukaCreateService talukacreateservice, TalukaDeleteService talukadeleteservice,
			TalukaUpdateService talukaupdateservice, TalukaFetchService talukafetchteservice,
			TalukaFetchAllService talukafetchAllteservice) {
		super();
		this.talukacreateservice = talukacreateservice;
		this.talukadeleteservice = talukadeleteservice;
		this.talukaupdateservice = talukaupdateservice;
		this.talukafetchteservice = talukafetchteservice;
		this.talukafetchAllteservice = talukafetchAllteservice;
	}

	@PostMapping
	public ResponseEntity<Taluka> createTaluka(@RequestBody Taluka taluka) {
		Taluka savedTaluka = talukacreateservice.addTaluka(taluka);

		return new ResponseEntity<>(savedTaluka, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Taluka>> getAllTaluka() {
		List<Taluka> talukas = talukafetchAllteservice.getAllTalukas();

		return ResponseEntity.ok(talukas);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Taluka> getTalukaById(@PathVariable int id) {
		Taluka taluka = talukafetchteservice.getTalukaByid(id);

		return ResponseEntity.ok(taluka);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Taluka> updateTaluka(@PathVariable int id, @RequestBody Taluka talukaDetails) {

		Taluka updatedTaluka = talukaupdateservice.updateTaluka(id, talukaDetails);

		return ResponseEntity.ok(updatedTaluka);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTaluka(@PathVariable int id) {

		talukadeleteservice.deleteTaluka(id);

		return ResponseEntity.ok("Taluka with ID " + id + " was deleted successfully.");
	}
}