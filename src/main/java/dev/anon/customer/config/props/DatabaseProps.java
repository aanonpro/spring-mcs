package dev.anon.customer.config.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
public class DatabaseProps {
    private String url;
    private String username;
    private String password;
    private String driver;
}
