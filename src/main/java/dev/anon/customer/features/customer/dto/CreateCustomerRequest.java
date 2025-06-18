package dev.anon.customer.features.customer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CreateCustomerRequest(
        @NotBlank(message = "First name is required")
        String firstName,

        @NotBlank(message = "First name is required")
        String lastName,

        @NotBlank(message = "First name is required")
        @Email
        String email,

        String phoneNumber,
        LocalDate dateOfBirth
) {
}
