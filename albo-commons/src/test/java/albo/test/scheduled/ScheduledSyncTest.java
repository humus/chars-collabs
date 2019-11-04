package albo.test.scheduled;

import static org.mockito.Mockito.verify;

import albo.test.repository.CharacterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ScheduledSyncTest {

    @InjectMocks
    private ScheduledSyncImpl scheduledSync;

    @Mock
    private CharacterRepository characterRepository;

    @Test
    public void testCallsCurrentCharacters() {
        scheduledSync.syncCurrentCharacters();

        verify(characterRepository).currentCharacters();
    }
    
}
