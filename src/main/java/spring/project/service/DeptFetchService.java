package spring.project.service;

import java.util.List;

import spring.project.entity.Dept;

public interface DeptFetchService {
List<Dept>getDepts();
Dept getDeptBYid(int id);
}
