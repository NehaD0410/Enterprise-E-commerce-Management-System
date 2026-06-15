package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Address;
import spring.project.repository.AddressRepository;
import spring.project.service.AddressFetchAllService;

@Service
public class AddressFetchAllServiceimple implements AddressFetchAllService {
	private final AddressRepository addressrepository;

	public AddressFetchAllServiceimple(AddressRepository addressrepository) {
		super();
		this.addressrepository = addressrepository;
	}

	@Override
	public List<Address> getAllAddresses() {
		// TODO Auto-generated method stub
		return addressrepository.findAll();
	}

}
