package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.entity.ShippingDetails;

@Repository
public interface ShippingDetailsRepository extends JpaRepository<ShippingDetails, Integer>{

}
