package spring.project.service;

import java.util.List;

import spring.project.entity.State;

public interface StateFetchService {
List<State>getStates();
State getStateByid(int id);
}
