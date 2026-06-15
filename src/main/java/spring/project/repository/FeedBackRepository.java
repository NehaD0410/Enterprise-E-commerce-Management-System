package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.FeedBack;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Integer>{

}
