package spring.project.service;

import java.util.List;

import spring.project.entity.Order;

public interface OrderFetchService {
List<Order>getOrders();
Order getOrderByid(int id);
}
