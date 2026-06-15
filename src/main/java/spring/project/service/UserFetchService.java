package spring.project.service;

import java.util.List;

import spring.project.entity.User;

public interface UserFetchService {
List<User>getUsers();
User getUserByid(int id);
}
