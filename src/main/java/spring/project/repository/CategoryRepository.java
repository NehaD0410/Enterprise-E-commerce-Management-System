package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
