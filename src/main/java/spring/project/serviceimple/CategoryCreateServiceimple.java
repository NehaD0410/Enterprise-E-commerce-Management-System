package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Category;
import spring.project.repository.CategoryRepository;
import spring.project.service.CategoryCreateService;

@Service
public class CategoryCreateServiceimple implements CategoryCreateService {

	private final CategoryRepository categoryRepository;

	public CategoryCreateServiceimple(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		Category savedCategory = categoryRepository.save(category);
		return savedCategory;

	}
}
