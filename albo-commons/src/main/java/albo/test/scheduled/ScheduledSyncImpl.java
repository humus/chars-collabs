package albo.test.scheduled;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import albo.test.client.MarvelClient;
import albo.test.db.MarvelCharacter;
import albo.test.repository.CharacterRepository;

public class ScheduledSyncImpl implements ScheduledSync {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private MarvelClient marvelClient;

    @Override
    @Scheduled(cron="0 0 3 * * ?")
    public void syncCurrentCharacters() {
        List<MarvelCharacter> characters = characterRepository.currentCharacters();

        for(MarvelCharacter marvelChar : characters) {
            marvelClient.findDataFor(marvelChar.getId());
        }
    }
}
