package dev.anon.customer.client;

import dev.anon.customer.client.dto.CategoryResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface PlatziFakeStoreClient {

    @GetExchange("/categories")
    List<CategoryResponse> getCategories();
}
