package dev.anon.customer.client;

import dev.anon.customer.client.dto.CategoryResponse;
import dev.anon.customer.client.dto.CreateProductRequest;
import dev.anon.customer.client.dto.FileUploadResponse;
import dev.anon.customer.client.dto.ProductsResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange
public interface PlatziFakeStoreClient {

    @PostExchange("/files/upload")
    FileUploadResponse uploadFile( @RequestPart MultipartFile file);

    @PostExchange("/products/")
    ProductsResponse createProduct(@RequestBody CreateProductRequest createProductRequest);

    @GetExchange("/products")
    List<ProductsResponse> getProducts(@RequestParam Integer offset,
                                      @RequestParam Integer limit);

    @GetExchange("/products/{id}")
    ProductsResponse getProductsById(@PathVariable Integer id);

    @GetExchange("/categories")
    List<CategoryResponse> getCategories();
}
