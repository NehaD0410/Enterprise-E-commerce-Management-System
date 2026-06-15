package spring.project.service;

import java.util.List;

import spring.project.entity.CompanyResponce;

public interface CompanyResponceFetchService {
List<CompanyResponce>getCompanyResponces();
CompanyResponce getCompanyResponceByid(int id);
}
