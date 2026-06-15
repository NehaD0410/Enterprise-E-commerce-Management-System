package spring.project.service;

import java.util.List;

import spring.project.entity.PaymentMode;

public interface PaymentModeFetchService {
List<PaymentMode>getPaymentModes();
PaymentMode getPaymentModeByid(int id);
}
