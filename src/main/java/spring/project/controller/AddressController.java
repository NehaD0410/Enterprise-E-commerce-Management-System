package spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.project.entity.Address;
import spring.project.service.AddressCreateService;
import spring.project.service.AddressDeleteService;
import spring.project.service.AddressFetchAllService;
import spring.project.service.AddressFetchService;
import spring.project.service.AddressUpdateService;

@RestController
@RequestMapping("/address")
public class AddressController {

//	private final AddressFactory addressFactory;
	@Autowired
	private final AddressCreateService addressCreateService;
	@Autowired
	private final AddressDeleteService addressdeleteteService;
	@Autowired
	private final AddressUpdateService addressupdateteService;
	@Autowired
	private final AddressFetchService addressfetchService;
	@Autowired
	private final AddressFetchAllService addressfetchallService;

	public AddressController(AddressCreateService addressCreateService, AddressDeleteService addressdeleteteService,
			AddressUpdateService addressupdateteService, AddressFetchService addressfetchService,
			AddressFetchAllService addressfetchallService) {
		super();
		this.addressCreateService = addressCreateService;
		this.addressdeleteteService = addressdeleteteService;
		this.addressupdateteService = addressupdateteService;
		this.addressfetchService = addressfetchService;
		this.addressfetchallService = addressfetchallService;
	}

	@PostMapping
	public ResponseEntity<Address> createAddress(@RequestBody Address address) {
		Address savedAddress = addressCreateService.addAddress(address);

		return new ResponseEntity<>(savedAddress, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Address>> getAllAddresses() {
		List<Address> addresses = addressfetchallService.getAllAddresses();

		return ResponseEntity.ok(addresses);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable int id) {
		Address address = addressfetchService.getAddressByid(id);

		return ResponseEntity.ok(address);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Address> updateAddress(@PathVariable int id, @RequestBody Address addressDetails) {

		Address updatedAddress = addressupdateteService.updateAddress(id, addressDetails);

		return ResponseEntity.ok(updatedAddress);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable int id) {

		addressdeleteteService.deleteAddress(id);

		return ResponseEntity.ok("Address with ID " + id + " was deleted successfully.");
	}
}