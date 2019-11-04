package albo.test.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import albo.test.repository.CharacterRepository;

public class ScheduledSyncImpl implements ScheduledSync {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    @Scheduled(cron="0 0 3 * * ?")
    public void syncCurrentCharacters() {
        characterRepository.currentCharacters();
    }
}
