package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Address;
import spring.project.repository.AddressRepository;
import spring.project.service.AddressFetchService;

@Service
public class AddressFetchServiceimple implements AddressFetchService {
	private final AddressRepository addressrepository;

	public AddressFetchServiceimple(AddressRepository addressrepository) {
		super();
		this.addressrepository = addressrepository;
	}

	@Override
	public List<Address> getAddresses() {
		// TODO Auto-generated method stub
		return addressrepository.findAll();
	}

	@Override
	public Address getAddressByid(int id) {
		// TODO Auto-generated method stub
		return addressrepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Address not found with id: " + id));
	}

}
