package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>{

}
