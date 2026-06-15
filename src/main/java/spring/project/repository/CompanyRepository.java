package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
