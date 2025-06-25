package dev.anon.customer.features.mock;

import dev.anon.customer.client.JsonPlaceHolderClient;
import dev.anon.customer.client.dto.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mock")
@RequiredArgsConstructor
public class MockController {

    private final JsonPlaceHolderClient jsonPlaceholderClient;

    @GetMapping("/posts")
    public List<PostResponse> getPosts() {
        return jsonPlaceholderClient.getPosts();
    }

}
