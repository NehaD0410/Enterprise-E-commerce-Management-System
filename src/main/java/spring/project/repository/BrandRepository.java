package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
