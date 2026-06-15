package spring.project.service;

import java.util.List;

import spring.project.entity.CustomerQuery;

public interface CustomerQueryFetchService {
List<CustomerQuery>getCustomerQueries();
CustomerQuery getCustomerQueryByid(int id);
}
