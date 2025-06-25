package dev.anon.customer.features.store;

import dev.anon.customer.client.PlatziFakeStoreClient;
import dev.anon.customer.client.dto.CategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
@RequiredArgsConstructor
public class FakeStoreController {

    private final PlatziFakeStoreClient platziFakeStoreClient;

    @GetMapping("/categories")
    public List<CategoryResponse> getCategories() {
        return platziFakeStoreClient.getCategories();
    }
}
