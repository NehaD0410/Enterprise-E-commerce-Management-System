package spring.project.service;

import java.util.List;

import spring.project.entity.Manager;

public interface ManagerFetchService {
List<Manager>getManagers();
Manager getManagerByid(int id);
}
