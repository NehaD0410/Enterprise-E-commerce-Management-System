package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Country;
import spring.project.repository.CountryRepository;
import spring.project.service.CountryFetchService;

@Service
public class CountryFetchServiceimple implements CountryFetchService {
	private final CountryRepository countryrepository;

	public CountryFetchServiceimple(CountryRepository countryrepository) {
		super();
		this.countryrepository = countryrepository;
	}

	@Override
	public List<Country> getCountries() {
		// TODO Auto-generated method stub
		return countryrepository.findAll();
	}

	@Override
	public Country getCountryByid(int id) {
		// TODO Auto-generated method stub
		return countryrepository.findById(id).orElseThrow(() -> new RuntimeException("State not found with id: " + id));
	}

}
