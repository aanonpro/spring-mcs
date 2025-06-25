package dev.anon.customer.client.dto;

public record PostResponse(
        Integer userId,
        Integer id,
        String title,
        String body
) {
}
