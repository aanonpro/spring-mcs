package dev.anon.customer;

import dev.anon.customer.config.props.DatabaseProps;
import dev.anon.customer.config.props.ServiceInfoProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value={ServiceInfoProps.class, DatabaseProps.class})
@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

}
