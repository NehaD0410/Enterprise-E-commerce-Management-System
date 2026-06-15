package spring.project.service;

import java.util.List;

import spring.project.entity.SubCategory;

public interface SubCategoryFetchService {
List<SubCategory>getSubCategories();
SubCategory getSubCategoryByid(int id);
}
