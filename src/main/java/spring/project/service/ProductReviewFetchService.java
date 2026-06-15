package spring.project.service;

import java.util.List;

import spring.project.entity.ProductReview;

public interface ProductReviewFetchService {
List<ProductReview>getProductReviews();
ProductReview getProductReviewByid(int id);
}
