package spring.project.service;

import java.util.List;

import spring.project.entity.ShippingDetails;

public interface ShippingDetailsFetchService {
List<ShippingDetails>getShippingDetails();
ShippingDetails getShippingDetailsByid(int id);
}
