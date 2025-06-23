package dev.anon.customer.features.customer;

import dev.anon.customer.domain.Customer;
import dev.anon.customer.features.customer.dto.CreateCustomerRequest;
import dev.anon.customer.features.customer.dto.CustomerResponse;
import dev.anon.customer.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper  customerMapper;

    @Override
    public List<CustomerResponse> getCustomers() {

        List<Customer> customers = customerRepository.findAll();

        return customers
                .stream()
                .map(customer -> CustomerResponse
                        .builder()
                        .customerNumber(customer.getCustomerNumber())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastName())
                        .email(customer.getEmail())
                        .build())
                .toList();
    }

    @Override
    public CustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest) {

        Customer customer = customerMapper.toCustomer(createCustomerRequest);
        customer.setCustomerNumber(UUID.randomUUID().toString());
        customer.setCreatedAt(LocalDateTime.now());
        customer.setUpdatedAt(LocalDateTime.now());


        //insert to database
        customer =  customerRepository.save(customer);
        return customerMapper.fromCustomer(customer);

//        return CustomerResponse
//                .builder()
//                .customerNumber(customer.getCustomerNumber())
//                .firstName(customer.getFirstName())
//                .lastName(customer.getLastName())
//                .email(customer.getEmail())
//                .build();
    }
}
