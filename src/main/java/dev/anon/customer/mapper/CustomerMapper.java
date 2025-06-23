package dev.anon.customer.mapper;

import dev.anon.customer.domain.Customer;
import dev.anon.customer.features.customer.dto.CreateCustomerRequest;
import dev.anon.customer.features.customer.dto.CustomerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    // Mapping logic
    // DTOs to Domain Models
    // Domain Models to DTOs
    Customer toCustomer(CreateCustomerRequest dto);
    CustomerResponse fromCustomer(Customer customer);
}
