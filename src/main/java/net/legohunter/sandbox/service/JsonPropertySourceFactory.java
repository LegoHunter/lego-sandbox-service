package net.legohunter.sandbox.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.Map;

@Slf4j
public class JsonPropertySourceFactory implements PropertySourceFactory {

    public JsonPropertySourceFactory() {
        log.info("JsonPropertySourceFactory");
    }

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        Map<String, Object> readValue = new ObjectMapper().readValue(resource.getInputStream(), Map.class);
        return new MapPropertySource("bricklink", readValue);
    }
}
