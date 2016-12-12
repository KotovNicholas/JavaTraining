package ua.training.model;

import ua.training.model.entity.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Model {
    private Integer firstLittleChar = 97;
    private Integer LastLittleChar = 122;

    private Integer firstBigChar = 65;
    private Integer LastBigChar = 90;

    public void createSentence(List<Character> text) {

        List<Components> componentsMain = new ArrayList<>();
        List<Components> component = new ArrayList<>();

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Character lastChar = null;

        Union union = new Union();

        int intcharacter = 0;

        for (Character character : text) {

            // ignore dubl of space
            if ((PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.SPACE) &
                    (PunctuationMark.getDelimiterAsChar(lastChar) == PunctuationMark.SPACE)) {
                continue;
            }

            intcharacter = (int) character;
            if (!(isPunctuationMark(character)
                    || ((intcharacter >= firstLittleChar & intcharacter <= LastLittleChar)
                    || (intcharacter >= firstBigChar & intcharacter <= LastBigChar)))) {
                continue;
            }


            if (PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.SPACE & component.isEmpty()) {
                continue;
            }

            // component.add(character);
            // System.out.println((int)character+"_"+isPunctuationMark(character));
            //System.out.println(PunctuationMark.getDelimiterAsChar(character));


            //create Sentence
            if (PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.DOT
                    ||PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.QUESTION_MARK
                    ||PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.EXCLAMATION_MARK) {

                union.setType(Type.SENTENCE);
                union.setSentence(component);
                component.add(flyweightFactory.getComponent(union));
                union.setType(null);
                union.setSentence(null);

                union.setType(Type.SYMBOL);
                union.setCharacter(character);
                component.add(flyweightFactory.getComponent(union));
                union.setType(null);
                union.setCharacter(null);

                continue;
            }

            //create word
            if (isPunctuationMark(character)) {
                union.setType(Type.WORD);
                union.setWord(component);
                component.add(flyweightFactory.getComponent(union));
                union.setType(null);
                union.setWord(null);

                union.setType(Type.SYMBOL);
                union.setCharacter(character);
                component.add(flyweightFactory.getComponent(union));
                union.setType(null);
                union.setCharacter(null);

                continue;
            }

            //create symbol
            union.setType(Type.SYMBOL);
            union.setCharacter(character);
            component.add(flyweightFactory.getComponent(union));
            union.setType(null);
            union.setCharacter(null);

            lastChar = character;

        }
        //component.forEach(System.out::println);
        //component.forEach(PrintText());

        System.out.println(component.size());

    }



    public boolean isPunctuationMark(Character character) {

        if (PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.COMA
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.DOT
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.QUESTION_MARK
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.EXCLAMATION_MARK
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.COLONS
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.SEMICOLON
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.DASH
                || PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.SPACE
                ) {
            return true;
        }

        return false;

    }
}


