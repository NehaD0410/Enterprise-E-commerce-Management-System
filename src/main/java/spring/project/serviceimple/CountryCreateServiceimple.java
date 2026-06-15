package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Country;
import spring.project.repository.CountryRepository;
import spring.project.service.CountryCreateService;

@Service
public class CountryCreateServiceimple implements CountryCreateService {
	private CountryRepository countryrepository;

	public CountryCreateServiceimple(CountryRepository countryrepository) {
		super();
		this.countryrepository = countryrepository;
	}

	@Override
	public Country addCountry(Country country) {
		// TODO Auto-generated method stub
		return countryrepository.save(country);
	}

}
