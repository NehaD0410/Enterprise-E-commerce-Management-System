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

import spring.project.entity.Category;
import spring.project.service.CategoryCreateService;
import spring.project.service.CategoryDeleteService;
import spring.project.service.CategoryFetchAllService;
import spring.project.service.CategoryFetchservice;
import spring.project.service.CategoryUpdateService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	private final CategoryCreateService categoryCreateService;
	private final CategoryUpdateService categoryUpdateService;
	private final CategoryFetchservice categoryFetchservice;
	private final CategoryFetchAllService categoryFetchAllService;
	private final CategoryDeleteService categoryDeleteService;

	public CategoryController(CategoryCreateService categoryCreateService, CategoryUpdateService categoryUpdateService,
			CategoryFetchservice categoryFetchservice, CategoryFetchAllService categoryFetchAllService,
			CategoryDeleteService categoryDeleteService) {

		this.categoryCreateService = categoryCreateService;
		this.categoryUpdateService = categoryUpdateService;
		this.categoryFetchservice = categoryFetchservice;
		this.categoryFetchAllService = categoryFetchAllService;
		this.categoryDeleteService = categoryDeleteService;
	}

	@PostMapping
	public ResponseEntity<Category> createCategory(@RequestBody Category category) {
		Category savedCategory = categoryCreateService.addCategory(category);
		return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryFetchAllService.getAllCategories();
		return ResponseEntity.ok(categories);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
		Category category = categoryFetchservice.getCategoryByid(id);
		return ResponseEntity.ok(category);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable int id, @RequestBody Category categoryDetails) {

		Category updatedCategory = categoryUpdateService.updateCategory(id, categoryDetails);

		return ResponseEntity.ok(updatedCategory);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable int id) {
		categoryDeleteService.deleteCategory(id);
		return ResponseEntity.ok("Category with ID " + id + " was deleted successfully.");
	}
}