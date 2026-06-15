package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer>{

}
