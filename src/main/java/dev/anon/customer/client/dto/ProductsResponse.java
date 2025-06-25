package dev.anon.customer.client.dto;

import java.math.BigDecimal;
import java.util.List;

public record ProductsResponse(
        Integer id,
        String title,
        String slug,
        BigDecimal price,
        String description,
        CategoryResponse category,
        List<String> images
) {
}
