package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.CountryRepository;
import spring.project.service.CountryDeleteService;

@Service
public class CountryDeleteServiceimple implements CountryDeleteService {
	private final CountryRepository countryrepository;

	public CountryDeleteServiceimple(CountryRepository countryrepository) {
		super();
		this.countryrepository = countryrepository;
	}

	@Override
	public void deleteCountry(int id) {
		// TODO Auto-generated method stub
		countryrepository.deleteById(id);
	}

}
