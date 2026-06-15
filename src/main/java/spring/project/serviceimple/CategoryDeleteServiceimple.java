package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.CategoryRepository;
import spring.project.service.CategoryDeleteService;

@Service
public class CategoryDeleteServiceimple implements CategoryDeleteService {

	private final CategoryRepository categoryRepository;

	public CategoryDeleteServiceimple(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

}