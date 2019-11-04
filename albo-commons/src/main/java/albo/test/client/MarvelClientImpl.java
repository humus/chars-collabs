package albo.test.client;

import java.time.LocalDateTime;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarvelClientImpl implements MarvelClient {

    public static final Logger log = LoggerFactory.getLogger(MarvelClientImpl.class);

    @Value("${marvel.monthsToFetch:12}")
    private Integer monthsToFetch;

    @Value("#{systemProperties[MARVEL_PUBLIC_KEY]}")
    private String publicKey;

    @Value("#{systemProperties[MARVEL_PRIVATE_KEY]}")
    private String privateKey;

    @Override
    public MarvelResponse fetchDataFor(Integer id) {

        long ts = System.currentTimeMillis();
        log.debug("timestamp for request: {}", ts);

        String hash = digestHash(ts);
        String fromDate = startingDate();
        log.debug("fromDate: {}", fromDate);

        Client client = ClientBuilder.newClient().register(JacksonJaxbJsonProvider.class);

        WebTarget target = client.target("https://gateway.marvel.com/v1")
                .path(String.format("/public/characters/%d/comics", id))
                .queryParam("ts", String.valueOf(ts))
                .queryParam("apikey", publicKey)
                .queryParam("hash", hash)
                .queryParam("modifiedSince", fromDate);

        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
        
        return invocationBuilder.get(MarvelResponse.class);
    }

    private String startingDate() {
        LocalDateTime starting = LocalDateTime.now()
                .minusMonths(monthsToFetch);

        return String.format("%1$tY-%1$tm-%1$td", starting);
    }
    
    private String digestHash(long timestamp) {
        return DigestUtils.md5Hex(String.format("%d%s%s",
                    timestamp,
                    privateKey,
                    publicKey));
    }
    
}
