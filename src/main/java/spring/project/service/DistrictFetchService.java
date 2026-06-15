package spring.project.service;

import java.util.List;

import spring.project.entity.District;

public interface DistrictFetchService {
List<District>getDistricts();
District getDistrictfindbyid(int id);
}
