package dev.anon.customer.features.customer;

import dev.anon.customer.features.customer.dto.CreateCustomerRequest;
import dev.anon.customer.features.customer.dto.CustomerResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerServiceImpl;

    @PostMapping
    public CustomerResponse customerResponse(@RequestBody @Valid CreateCustomerRequest createCustomerRequest) {
        return customerServiceImpl.createCustomer(createCustomerRequest);
    }

    @GetMapping("/public")
    public List<CustomerResponse> getCustomerPublic() {
        return customerServiceImpl.getCustomers();
    }

    @GetMapping("/private")
    public CustomerResponse getCustomerPrivate() {
//        return CustomerResponse.builder()
//                .customerId("Cus-002")
//                .firstName("Anon2")
//                .lastName("Phin")
//                .kyc("Rejected")
//                .build();
        return null;
    }
}
