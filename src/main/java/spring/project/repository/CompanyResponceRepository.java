package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.CompanyResponce;

@Repository
public interface CompanyResponceRepository extends JpaRepository<CompanyResponce, Integer>{

}
