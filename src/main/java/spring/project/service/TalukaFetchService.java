package spring.project.service;

import java.util.List;

import spring.project.entity.Taluka;

public interface TalukaFetchService {
List<Taluka>getTalukas();
Taluka getTalukaByid(int id);
}
