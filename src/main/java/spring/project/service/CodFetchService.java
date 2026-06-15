package spring.project.service;

import java.util.List;

import spring.project.entity.Cod;

public interface CodFetchService {
List<Cod>getCods();
Cod getCodByid(int id);
}
