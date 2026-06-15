package spring.project.service;

import java.util.List;

import spring.project.entity.Company;

public interface CompanyFetchService {
List<Company>getCompanies();
Company getCompanyByid(int id);
}
