package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer>{

}
