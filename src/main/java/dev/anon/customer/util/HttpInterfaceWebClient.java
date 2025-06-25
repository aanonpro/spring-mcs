package dev.anon.customer.util;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Component
public class HttpInterfaceWebClient {
    public <T> T createClient(String baseUrl, Class<T> interfaceClass) {
        // Step 1 => Create web client object
        WebClient webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
        return createClient(webClient, interfaceClass);
    }

    public <T> T createClient(WebClient webClient, Class<T> interfaceClass) {
        // Step 2 => Create http proxy factory
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder()
                .exchangeAdapter(WebClientAdapter.create(webClient))
                .build();
        return factory.createClient(interfaceClass);
    }
}
