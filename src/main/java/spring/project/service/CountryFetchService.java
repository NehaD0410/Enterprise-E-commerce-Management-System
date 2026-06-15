package spring.project.service;

import java.util.List;

import spring.project.entity.Country;

public interface CountryFetchService {
List<Country>getCountries();
Country getCountryByid(int id);
}
