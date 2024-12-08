package net.legohunter.sandbox.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class SandboxServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SandboxServiceApplication.class)
                .run(args);
    }
}
