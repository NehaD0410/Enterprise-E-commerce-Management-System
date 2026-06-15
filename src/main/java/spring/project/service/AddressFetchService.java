package spring.project.service;

import java.util.List;

import spring.project.entity.Address;

public interface AddressFetchService {
List<Address>getAddresses();
Address getAddressByid(int id);
}
