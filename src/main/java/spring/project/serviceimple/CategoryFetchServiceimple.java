package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Category;
import spring.project.repository.CategoryRepository;
import spring.project.service.CategoryFetchservice;

@Service
public class CategoryFetchServiceimple implements CategoryFetchservice {

	private final CategoryRepository categoryRepository;

	public CategoryFetchServiceimple(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryByid(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("category not found with id: " + id));
	}

}