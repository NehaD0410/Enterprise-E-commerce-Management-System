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

import spring.project.entity.Country;
import spring.project.service.CountryCreateService;
import spring.project.service.CountryDeleteService;
import spring.project.service.CountryFetchAllService;
import spring.project.service.CountryFetchService;
import spring.project.service.CountryUpdateService;

@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private final CountryCreateService countrycreateservice;
	@Autowired
	private final CountryDeleteService countrydeleteservice;
	@Autowired
	private final CountryUpdateService countryupdateteservice;
	@Autowired
	private final CountryFetchService countryfetchservice;
	@Autowired
	private final CountryFetchAllService countryfetchallservice;

	public CountryController(CountryCreateService countrycreateservice, CountryDeleteService countrydeleteservice,
			CountryUpdateService countryupdateteservice, CountryFetchService countryfetchservice,
			CountryFetchAllService countryfetchallservice) {
		super();
		this.countrycreateservice = countrycreateservice;
		this.countrydeleteservice = countrydeleteservice;
		this.countryupdateteservice = countryupdateteservice;
		this.countryfetchservice = countryfetchservice;
		this.countryfetchallservice = countryfetchallservice;
	}

	@PostMapping
	public ResponseEntity<Country> createCountry(@RequestBody Country country) {
		Country savedCountry = countrycreateservice.addCountry(country);

		return new ResponseEntity<>(savedCountry, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Country>> getAllCountries() {
		List<Country> countries = countryfetchallservice.getAllCountries();

		return ResponseEntity.ok(countries);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable int id) {
		Country country = countryfetchservice.getCountryByid(id);

		return ResponseEntity.ok(country);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Country> updateCountry(@PathVariable int id, @RequestBody Country countryDetails) {

		Country updatedCountry = countryupdateteservice.updateCountry(id, countryDetails);

		return ResponseEntity.ok(updatedCountry);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCountry(@PathVariable int id) {

		countrydeleteservice.deleteCountry(id);

		return ResponseEntity.ok("Country with ID " + id + " was deleted successfully.");
	}
}