package albo.test.repository;

import java.util.List;

import albo.test.db.MarvelCharacter;

public interface CharacterRepository {

    List<MarvelCharacter> currentCharacters();
    
}
