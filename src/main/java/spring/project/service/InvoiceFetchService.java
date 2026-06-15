package spring.project.service;

import java.util.List;

import spring.project.entity.Invoice;

public interface InvoiceFetchService {
List<Invoice>getInvoices();
Invoice getInvoiceByid(int id);
}
