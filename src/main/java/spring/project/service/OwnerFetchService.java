package spring.project.service;

import java.util.List;

import spring.project.entity.Owner;

public interface OwnerFetchService {
List<Owner>getOwners();
Owner getOwnerByid(int id);
}
