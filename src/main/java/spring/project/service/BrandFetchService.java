package spring.project.service;

import java.util.List;

import spring.project.entity.Brand;

public interface BrandFetchService {
List<Brand>getBrands();
Brand getBrandByid(int id);
}
