package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Upi;

@Repository
public interface UpiRepository extends JpaRepository<Upi, Integer>{

}
