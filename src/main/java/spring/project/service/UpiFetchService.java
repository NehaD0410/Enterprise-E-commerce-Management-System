package spring.project.service;

import java.util.List;

import spring.project.entity.Upi;

public interface UpiFetchService {
List<Upi>getUpis();
Upi getUpiByid(int id);
}
