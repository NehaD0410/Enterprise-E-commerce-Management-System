package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Country;
import spring.project.repository.CountryRepository;
import spring.project.service.CountryUpdateService;

@Service
public class CountryUpdateServiceimple implements CountryUpdateService {
	private final CountryRepository countryrepository;

	public CountryUpdateServiceimple(CountryRepository countryrepository) {
		super();
		this.countryrepository = countryrepository;
	}

	@Override
	public Country updateCountry(int id, Country country) {
		// TODO Auto-generated method stub
		Country existingCountry = countryrepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Country not found with id: " + id));
		existingCountry.setName(country.getName());
		return countryrepository.save(existingCountry);
	}

}
