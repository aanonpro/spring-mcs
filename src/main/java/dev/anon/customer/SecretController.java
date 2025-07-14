package dev.anon.customer;

import dev.anon.customer.config.props.ServiceInfoProps;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class SecretController {

    private final ServiceInfoProps serviceInfoProps;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @GetMapping("/secrets")
    public Map<String, Object> secret() {
        return Map.of("info", serviceInfoProps.getInfo(),
                "version", serviceInfoProps.getVersion(),
                "url", dbUrl,
                "username", dbUsername,
                "password", dbPassword);
    }

}
