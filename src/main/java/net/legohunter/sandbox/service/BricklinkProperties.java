package net.legohunter.sandbox.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "bricklink")
public class BricklinkProperties {
    private Consumer consumer;
    private Token token;

    @Data
    public static class Consumer {
        private String key;
        private String secret;
    }

    @Data
    public static class Token {
        private String value;
        private String secret;
    }
}
