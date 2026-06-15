package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.Tracking;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Integer>{

}
