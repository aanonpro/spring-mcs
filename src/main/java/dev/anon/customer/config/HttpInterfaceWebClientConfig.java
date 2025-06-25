package dev.anon.customer.config;

import dev.anon.customer.client.JsonPlaceHolderClient;
import dev.anon.customer.client.PlatziFakeStoreClient;
import dev.anon.customer.util.HttpInterfaceWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class HttpInterfaceWebClientConfig {

    private final HttpInterfaceWebClient httpInterfaceWebClient;

    @Bean
    public PlatziFakeStoreClient platziFakeStoreClient() {
        return httpInterfaceWebClient
                .createClient(
                        "https://api.escuelajs.co/api/v1",
                        PlatziFakeStoreClient.class
                );
    }

    @Bean
    public JsonPlaceHolderClient jsonPlaceholderClient() {
        return httpInterfaceWebClient
                .createClient(
                        "https://jsonplaceholder.typicode.com",
                        JsonPlaceHolderClient.class
                );
    }


//    @Bean
//    public PlatziFakeStoreClient platziFakeStoreClient() {
//
//        // Step 1 => Create web client object
//        WebClient webClient = WebClient.builder()
//                .baseUrl("https://api.escuelajs.co/api/v1")
//                .build();
//
//        // Step 2 => Create http proxy factory
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder()
//                .exchangeAdapter(WebClientAdapter.create(webClient))
//                .build();
//        return factory.createClient(PlatziFakeStoreClient.class);
//    }

}
