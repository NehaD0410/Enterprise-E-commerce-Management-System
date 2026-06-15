package spring.project.service;

import java.util.List;

import spring.project.entity.Admin;

public interface AdminFetchService {
List<Admin>getAdmins();
Admin getAdminByid(int id);

}
