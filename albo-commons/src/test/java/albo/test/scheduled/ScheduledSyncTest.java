package albo.test.scheduled;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import albo.test.client.MarvelClient;
import albo.test.db.MarvelCharacter;
import albo.test.repository.CharacterRepository;

@ExtendWith(MockitoExtension.class)
public class ScheduledSyncTest {

    @InjectMocks
    private ScheduledSyncImpl scheduledSync;

    @Mock
    private CharacterRepository characterRepository;

    @Mock
    private MarvelClient marvelClient;

    @Test
    public void testCallsCurrentCharacters() {
        when(characterRepository.currentCharacters())
                .thenReturn(characters());

        scheduledSync.syncCurrentCharacters();

        verify(marvelClient).fetchDataFor(1);
        verify(marvelClient).fetchDataFor(2);
    }

    private List<MarvelCharacter> characters() {
        return Arrays.asList(character("Hulk", 1),
                character("Groot", 2));
    }
    
    private MarvelCharacter character(String name, Integer id) {
        MarvelCharacter marvelCharacter = new MarvelCharacter();
        marvelCharacter.setName(name);
        marvelCharacter.setId(id);
        return marvelCharacter;
    }
    
}
