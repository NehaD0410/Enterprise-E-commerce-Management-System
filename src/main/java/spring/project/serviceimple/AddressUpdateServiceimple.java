package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Address;
import spring.project.repository.AddressRepository;
import spring.project.service.AddressUpdateService;

@Service
public class AddressUpdateServiceimple implements AddressUpdateService {
	private final AddressRepository addressRepository;

	public AddressUpdateServiceimple(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address updateAddress(int id, Address address) {
		// TODO Auto-generated method stub
		Address existingAddress = addressRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Country not found with id: " + id));
		existingAddress.setCountry(address.getCountry());
		return addressRepository.save(existingAddress);
	}

}
