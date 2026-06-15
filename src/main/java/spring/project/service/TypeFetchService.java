package spring.project.service;

import java.util.List;

import spring.project.entity.Type;

public interface TypeFetchService {
List<Type>getTypes();
Type getTypeByid(int id);
}
