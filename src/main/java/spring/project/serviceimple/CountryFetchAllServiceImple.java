package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Country;
import spring.project.repository.CountryRepository;
import spring.project.service.CountryFetchAllService;

@Service
public class CountryFetchAllServiceImple implements CountryFetchAllService {
	private CountryRepository countryrepository;

	public CountryFetchAllServiceImple(CountryRepository countryrepository) {
		super();
		this.countryrepository = countryrepository;
	}

	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return countryrepository.findAll();
	}

}
