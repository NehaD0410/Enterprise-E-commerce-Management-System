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

import spring.project.entity.Town;
import spring.project.service.TownCreateService;
import spring.project.service.TownDeleteService;
import spring.project.service.TownFetchAllService;
import spring.project.service.TownFetchService;
import spring.project.service.TownUpdateService;

@RestController
@RequestMapping("town")
public class TownController {
	@Autowired
	private final TownCreateService towncreateservice;
	@Autowired
	private final TownDeleteService towndeleteservice;
	@Autowired
	private final TownUpdateService townupdateservice;
	@Autowired
	private final TownFetchService townfetchservice;
	@Autowired
	private final TownFetchAllService townfetchallservice;

	public TownController(TownCreateService towncreateservice, TownDeleteService towndeleteservice,
			TownUpdateService townupdateservice, TownFetchService townfetchservice,
			TownFetchAllService townfetchallservice) {
		super();
		this.towncreateservice = towncreateservice;
		this.towndeleteservice = towndeleteservice;
		this.townupdateservice = townupdateservice;
		this.townfetchservice = townfetchservice;
		this.townfetchallservice = townfetchallservice;
	}

	@PostMapping
	public ResponseEntity<Town> createTown(@RequestBody Town town) {
		Town savedTown = towncreateservice.addTown(town);
		return new ResponseEntity<>(savedTown, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Town>> getAllTowns() {
		List<Town> towns = townfetchallservice.getAllTowns();
		return ResponseEntity.ok(towns);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Town> getTownById(@PathVariable int id) {
		Town town = townfetchservice.GetTownByid(id);
		return ResponseEntity.ok(town);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Town> updateTown(@PathVariable int id, @RequestBody Town townDetails) {
		Town updatedTown = townupdateservice.updateTown(id, townDetails);
		return ResponseEntity.ok(updatedTown);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTown(@PathVariable int id) {
		towndeleteservice.DeleteTown(id);
		return ResponseEntity.ok("Town with ID " + id + " was deleted successfully.");
	}

}
