package net.legohunter.sandbox.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
@EnableConfigurationProperties({BricklinkProperties.class})
public class SecretsReaderCommand implements CommandLineRunner {

    private final BricklinkProperties bricklinkProperties;

    @Override
    public void run(String... args) throws Exception {
        log.info("bricklinkProperties : {}", bricklinkProperties);


//        byte[] bytes = Files.readAllBytes(Paths.get("/etc/.credentials/bricklink", "bricklink.json"));
//        String jsonContents = new String(bytes);
//        log.info("bricklink.json : {}", jsonContents);
    }
}
