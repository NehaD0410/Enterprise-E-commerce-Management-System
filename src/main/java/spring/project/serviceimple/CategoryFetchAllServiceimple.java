package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Category;
import spring.project.repository.CategoryRepository;
import spring.project.service.CategoryFetchAllService;

@Service
public class CategoryFetchAllServiceimple implements CategoryFetchAllService{

	private final CategoryRepository categoryRepository;
	
	public CategoryFetchAllServiceimple(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}