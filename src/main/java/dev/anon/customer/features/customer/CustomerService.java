package dev.anon.customer.features.customer;

import dev.anon.customer.features.customer.dto.CreateCustomerRequest;
import dev.anon.customer.features.customer.dto.CustomerResponse;
import jakarta.validation.Valid;

import java.util.List;

public interface CustomerService {
    List<CustomerResponse>  getCustomers();

    CustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest);
}
