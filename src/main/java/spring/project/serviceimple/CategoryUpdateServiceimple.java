package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Category;
import spring.project.repository.CategoryRepository;
import spring.project.service.CategoryUpdateService;

@Service
public class CategoryUpdateServiceimple implements CategoryUpdateService {

	private final CategoryRepository categoryRepository;

	public CategoryUpdateServiceimple(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category updateCategory(int id, Category category) {
		// TODO Auto-generated method stub
		Category existingCategory = categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
		existingCategory.setName(category.getName());
		return categoryRepository.save(existingCategory);

	}

}