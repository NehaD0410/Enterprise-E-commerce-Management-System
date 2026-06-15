package spring.project.service;

import java.util.List;

import spring.project.entity.Category;

public interface CategoryFetchservice {
List<Category>getCategories();
Category getCategoryByid(int id);
}
