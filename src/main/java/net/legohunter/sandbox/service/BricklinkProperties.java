package net.legohunter.sandbox.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "bricklink")
public class BricklinkProperties {
    private Consumer consumer;
    private Token token;
    private Credential credential;
    Map<String, String> urls;

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

    @Data
    public static class Credential {
        private String username;
        private String password;
    }
}
