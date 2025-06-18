package dev.anon.customer.features.customer.dto;

import lombok.Builder;

@Builder
public record CustomerResponse(
        String customerNumber,
        String firstName,
        String lastName,
        String email

) {

}
