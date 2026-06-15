package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.ProductReview;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview, Integer>{

}
