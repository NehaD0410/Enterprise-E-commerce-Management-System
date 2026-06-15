package spring.project.service;

import java.util.List;

import spring.project.entity.Town;

public interface TownFetchService {
List<Town>getTowns();
Town GetTownByid(int id);
}
