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

import spring.project.entity.District;
import spring.project.service.DistrictCreateService;
import spring.project.service.DistrictDeleteService;
import spring.project.service.DistrictFetchAllService;
import spring.project.service.DistrictFetchService;
import spring.project.service.DistrictUpdateService;

@RestController
@RequestMapping("/District")
public class DistrictController {
	@Autowired
	private final DistrictCreateService districtcreateservie;
	@Autowired
	private final DistrictDeleteService districtdeleteservie;
	@Autowired
	private final DistrictUpdateService districtupdateservie;
	@Autowired
	private final DistrictFetchService districtfetchservie;
	@Autowired
	private final DistrictFetchAllService districtfetchallservie;

	public DistrictController(DistrictCreateService districtcreateservie, DistrictDeleteService districtdeleteservie,
			DistrictUpdateService districtupdateservie, DistrictFetchService districtfetchservie,
			DistrictFetchAllService districtfetchallservie) {
		super();
		this.districtcreateservie = districtcreateservie;
		this.districtdeleteservie = districtdeleteservie;
		this.districtupdateservie = districtupdateservie;
		this.districtfetchservie = districtfetchservie;
		this.districtfetchallservie = districtfetchallservie;
	}

	@PostMapping
	public ResponseEntity<District> createDistrict(@RequestBody District district) {
		District savedDistrict = districtcreateservie.addDistrict(district);

		return new ResponseEntity<>(savedDistrict, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<District>> getAllDistricts() {
		List<District> districts = districtfetchallservie.getAllDistricts();

		return ResponseEntity.ok(districts);
	}

	@GetMapping("/{id}")
	public ResponseEntity<District> getDistrictById(@PathVariable int id) {
		District district = districtfetchservie.getDistrictfindbyid(id);

		return ResponseEntity.ok(district);
	}

	@PutMapping("/{id}")
	public ResponseEntity<District> updateDistrict(@PathVariable int id, @RequestBody District districtDetails) {

		District updatedDistrict = districtupdateservie.UpdateDistrict(id, districtDetails);

		return ResponseEntity.ok(updatedDistrict);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDistrict(@PathVariable int id) {

		districtdeleteservie.DeleteDistrict(id);

		return ResponseEntity.ok("District with ID " + id + " was deleted successfully.");
	}
}