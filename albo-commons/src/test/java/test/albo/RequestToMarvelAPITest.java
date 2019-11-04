package test.albo;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestToMarvelAPITest {

    public static final Logger log = LoggerFactory.getLogger(RequestToMarvelAPITest.class);

    @Test
    public void testCallingApiGetComics() {
        int characterId = 1009351;

        long ts = System.currentTimeMillis();
        String publicKey = System.getenv("MARVEL_PUBLIC_KEY");
        String privateKey = System.getenv("MARVEL_PRIVATE_KEY");

        String hash = DigestUtils.md5Hex(String.format("%d%s%s", ts, privateKey, publicKey));

        String fromDate = String.format("%1$tY-%1$tm-%1$td", LocalDate.now()
                .minusYears(1)
                .plusDays(1));
        String toDate = String.format("%1$tY-%1$tm-%1$td", LocalDate.now());
        String dateRange = String.format("%1$s,%2$s", fromDate, toDate);
        log.debug("dateRange: {}", dateRange);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://gateway.marvel.com/v1")
                .path(String.format("/public/characters/%d/comics", characterId))
                .queryParam("ts", String.valueOf(ts))
                .queryParam("apikey", publicKey)
                .queryParam("hash", hash)
                .queryParam("modifiedSince", fromDate);

        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

        String response = invocationBuilder.get(String.class);

        log.debug("response: {}", response);
    }

    @Test @Disabled
    public void testCallingApiGetCharacter() {
        String name = "Spider-Man";

        long ts = System.currentTimeMillis();
        log.info("Current time millis: {}", ts);
        

        String publicKey = System.getenv("MARVEL_PUBLIC_KEY");
        String privateKey = System.getenv("MARVEL_PRIVATE_KEY");

        String hash = DigestUtils.md5Hex(String.format("%d%s%s", ts, privateKey, publicKey));

        log.info("hash: {}", hash);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://gateway.marvel.com/v1")
            .path("/public/characters")
            .queryParam("ts", String.valueOf(ts))
            .queryParam("apikey", publicKey)
            .queryParam("hash", hash)
            .queryParam("name", name);

        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

        String response = invocationBuilder.get(String.class);
        log.info("response: {}", response);
    }
    
}
