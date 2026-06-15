package spring.project.service;

import java.util.List;

import spring.project.entity.Role;

public interface RoleFetchService {
List<Role>getRoles();
Role getRoleByid(int id);
}
