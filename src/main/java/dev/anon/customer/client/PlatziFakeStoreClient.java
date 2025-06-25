package dev.anon.customer.client;

import dev.anon.customer.client.dto.CategoryResponse;
import dev.anon.customer.client.dto.ProductsResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface PlatziFakeStoreClient {

    @GetExchange("/products")
    List<ProductsResponse> getProducts(@RequestParam Integer offset,
                                      @RequestParam Integer limit);

    @GetExchange("/products/{id}")
    ProductsResponse getProductsById(@PathVariable Integer id);

    @GetExchange("/categories")
    List<CategoryResponse> getCategories();
}
