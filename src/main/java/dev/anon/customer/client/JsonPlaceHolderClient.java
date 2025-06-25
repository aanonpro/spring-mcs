package dev.anon.customer.client;

import dev.anon.customer.client.dto.PostResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface JsonPlaceHolderClient {
    @GetExchange("/posts")
    List<PostResponse>  getPosts();
}
