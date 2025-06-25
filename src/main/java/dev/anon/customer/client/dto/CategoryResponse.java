package dev.anon.customer.client.dto;

import java.time.LocalDateTime;

public record CategoryResponse(
        Integer Id,
        String name,
        String slug,
        String image,
        LocalDateTime creationAt,
        LocalDateTime updateAt
) {
}
