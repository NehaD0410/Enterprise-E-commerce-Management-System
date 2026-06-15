package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

}
