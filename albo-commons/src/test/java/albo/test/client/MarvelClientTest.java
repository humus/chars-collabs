package albo.test.client;

import static org.springframework.test.util.ReflectionTestUtils.setField;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarvelClientTest {

    public static final Logger log = LoggerFactory.getLogger(MarvelClientTest.class);

    @Test
    public void testFetchHulkComics() {
        MarvelClient marvelClient = marvelClient();
        
        int hulkId = 1009351;
        MarvelResponse response = marvelClient.fetchDataFor(hulkId);

        MarvelData data = response.getData();
        List<MarvelComic> result = data.getResults();

        for (MarvelComic comic : result) {
            listCreators(comic);
            listCharacters(comic);
        }
    }

    private void listCreators(MarvelComic comic) {
        MarvelCreators creators = comic.getCreators();
        List<MarvelCreator> creatorList = creators.getItems();
        for (MarvelCreator creator : creatorList) {
            log.info("name: {} \nrole: {}, \nid: {}",
                    creator.getName(),
                    creator.getRole(),
                    creator.getResourceURI().replaceAll(".+/(\\d+)$", "$1")
                    );
        }
    }

    private void listCharacters(MarvelComic comic) {
        MarvelChars chars = comic.getCharacters();
        List<MarvelChar> characterList = chars.getItems();

        for (MarvelChar ch : characterList) {
            log.info("\ncomic: {} \ncharacter: {}, \nid: {}",
                    comic.getTitle(),
                    ch.getName(),
                    ch.getResourceURI().replaceAll(".+/(\\d+)$", "$1"));
        }
    }

    private MarvelClientImpl marvelClient() {
        MarvelClientImpl marvelClient = new MarvelClientImpl();
        setField(marvelClient, "monthsToFetch", 12);
        setField(marvelClient, "publicKey", System.getenv("MARVEL_PUBLIC_KEY"));
        setField(marvelClient, "privateKey", System.getenv("MARVEL_PRIVATE_KEY"));
        return marvelClient;
    }
    
}
