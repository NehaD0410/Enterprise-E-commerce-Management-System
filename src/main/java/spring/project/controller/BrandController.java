package spring.project.controller;

import java.util.List;

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

import spring.project.entity.Brand;
import spring.project.service.BrandCreateService;
import spring.project.service.BrandDeleteService;
import spring.project.service.BrandFetchAllService;
import spring.project.service.BrandFetchService;
import spring.project.service.BrandUpdateService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	private final BrandCreateService brandCreateService;
	private final BrandUpdateService brandUpdateService;
	private final BrandFetchService brandFetchService;
	private final BrandFetchAllService brandFetchAllService;
	private final BrandDeleteService brandDeleteService;

	public BrandController(BrandCreateService brandCreateService, BrandUpdateService brandUpdateService,
			BrandFetchService brandFetchService, BrandFetchAllService brandFetchAllService,
			BrandDeleteService brandDeleteService) {
		super();
		this.brandCreateService = brandCreateService;
		this.brandUpdateService = brandUpdateService;
		this.brandFetchService = brandFetchService;
		this.brandFetchAllService = brandFetchAllService;
		this.brandDeleteService = brandDeleteService;
	}

	@PostMapping
	public ResponseEntity<Brand> createBrand(@RequestBody Brand brand) {
		Brand savedBrand = brandCreateService.AddBrand(brand);
		return new ResponseEntity<>(savedBrand, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Brand>> getAllBrand() {
		List<Brand> brands = brandFetchAllService.brands();
		return ResponseEntity.ok(brands);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Brand> getBrandById(@PathVariable int id) {
		Brand brand = brandFetchService.getBrandByid(id);
		return ResponseEntity.ok(brand);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Brand> updateBrand(@PathVariable int id, @RequestBody Brand brandDetails) {
		Brand updatedbrand = brandUpdateService.updateBrand(id, brandDetails);
		return ResponseEntity.ok(updatedbrand);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBrand(@PathVariable int id) {
		brandDeleteService.deleteBrand(id);
		return ResponseEntity.ok("Brand with ID " + id + " was deleted successfully.");
	}
}