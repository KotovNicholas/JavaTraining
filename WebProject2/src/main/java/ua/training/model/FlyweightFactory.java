package ua.training.model;

import ua.training.model.entity.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class FlyweightFactory {
    private static final Map<Character, Symbol> componentsSymbol = new HashMap<>();
    private static final Map<List<Components>, Word> componentsWord = new HashMap<>();
    private static final Map<List<Components>, Sentence> componentsSentence = new HashMap<>();

    public Components getComponent(Union union) {

        switch (union.getType()) {

            case SYMBOL:

                Character character = union.getCharacter();
                Symbol symbolFind = componentsSymbol.get(character);
                if (symbolFind == null) {
                    symbolFind = new Symbol(character);
                    componentsSymbol.put(character, symbolFind);
                }

                return (Components) symbolFind;
            //break;
            case WORD:
                List<Components> symbolList = union.getWord();
                Word wordFind = componentsWord.get(symbolList);
                if (wordFind == null) {
                    wordFind = new Word(symbolList);
                    componentsWord.put(symbolList, wordFind);
                }
                return (Components) wordFind;
            //break;
            case SENTENCE:
                List<Components> componentsList = union.getSentence();
                Sentence sentenceFind = componentsSentence.get(componentsList);
                if (sentenceFind == null) {
                    sentenceFind = new Sentence(componentsList);
                    componentsSentence.put(componentsList, sentenceFind);
                }
                return (Components) sentenceFind;
            //break;
        }

        return null;
    }
}
