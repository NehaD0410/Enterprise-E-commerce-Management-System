package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Address;
import spring.project.repository.AddressRepository;
import spring.project.service.AddressCreateService;

@Service
public class AddressCreateServiceimple implements AddressCreateService{

	private final AddressRepository addressRepository;
	
	public AddressCreateServiceimple(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		Address savedAddress=addressRepository.save(address);
		return savedAddress;
	}
	

}
