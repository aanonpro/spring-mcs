package dev.anon.customer.client.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

public record CreateProductRequest(
        @NotBlank(message = "Title is required")
        String title,

        @NotNull(message = "Price is required")
        @Positive
        BigDecimal price,

        String description,

        @NotNull(message = "Category is required")
        @Positive
        Integer categoryId,

        @NotEmpty(message = "Image is required")
        List<@NotBlank(message = "Image URL cannot be blank") String> images
) {
}
