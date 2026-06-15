package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.AddressRepository;
import spring.project.service.AddressDeleteService;

@Service
public class AddressDeleteServiceimple implements AddressDeleteService{

	private final AddressRepository addressRepository;
	public AddressDeleteServiceimple(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}
	@Override
	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		addressRepository.deleteById(id);
	}

}
