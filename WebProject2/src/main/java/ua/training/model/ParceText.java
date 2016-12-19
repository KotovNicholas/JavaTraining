package ua.training.model;

import ua.training.model.entity.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class ParceText {
    private Integer firstLittleChar = 97;
    private Integer LastLittleChar = 122;

    private Integer firstBigChar = 65;
    private Integer LastBigChar = 90;
    private ua.training.model.entity.PunctuationMark PunctuationMark;

    public Composite createCompositeFromText(List<Character> text) {

        Composite compositeMain = new Composite(Type.AllText);
        List<Symbol> cacheSymbols = new ArrayList<>();
        List<Composite> cacheWords = new ArrayList<>();

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Character lastChar = null;


        for (Character character : text) {
            if (checkErrors(character, lastChar, cacheSymbols)) {
                continue;
            }



            //create Sentence
            if (PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.DOT
                    ||PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.QUESTION_MARK
                    ||PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.EXCLAMATION_MARK) {

                //cacheSentences.add(flyweightFactory.getWord(cacheSymbols));

                //create last word at the sentence
                cacheWords = createWord(flyweightFactory, cacheSymbols, cacheWords, character, true);
                cacheSymbols = new ArrayList<>();

                compositeMain = createSentences(compositeMain, cacheWords, character);
                cacheWords = new ArrayList<>();


                continue;
            }

            //create word



            if (isPunctuationMark(character)) {

                cacheWords = createWord(flyweightFactory, cacheSymbols, cacheWords, character, true);
                cacheSymbols = new ArrayList<>();

                continue;
            }



            //create symbol

            cacheSymbols.add(flyweightFactory.getSymbol(character));

            lastChar = character;

        }


        return compositeMain;
    }


    /**
     * check Punctuation Mark
     * @param character
     * @return true in case Punctuation Mark
     */
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

    /**
     * check all situations
     * @param character
     * @param lastChar
     * @param cacheComponent
     * @return
     */
    public boolean checkErrors(Character character, Character lastChar,  List<Symbol> cacheComponent){
        //ignore dubl of space
        if (checkLastChar(character, lastChar)) {
            return true;
        }

        //check Roman alphabet
        if (checkCharacterRomanAlphabet(character)) {
            return true;
        }


        //check empty character
        if (checkCharactersIsEmpty (character, cacheComponent)) {
            return true;
        }

        return false;
    }

    /**
     * check Last Char
     * @param character
     * @param lastChar
     * @return true in case dubl space
    */
    public boolean checkLastChar (Character character, Character lastChar) {

        if ((PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.SPACE) &
                (PunctuationMark.getDelimiterAsChar(lastChar) == PunctuationMark.SPACE)){
            return true;
        }

        return false;

    }

    /**
     * check Roman alphabet
     * @param character
     * @return true in case Character Roman alphabet
     */
    public boolean checkCharacterRomanAlphabet (Character character) {

        int intcharacter = (int) character;
        if (!(isPunctuationMark(character)
                || ((intcharacter >= firstLittleChar & intcharacter <= LastLittleChar)
                || (intcharacter >= firstBigChar & intcharacter <= LastBigChar)))) {
            return true;
        }

        return false;
    }

    /**
     * check empty character
     * @param character
     * @return true in case character is Empty
     */
    public boolean checkCharactersIsEmpty (Character character, List<Symbol> cacheComponent) {

        if (PunctuationMark.getDelimiterAsChar(character) == PunctuationMark.SPACE & cacheComponent.isEmpty()) {
            return true;
        }

        return false;
    }

    /**
     * add in main composite sentence
     * @param compositeMain
     * @param cacheWords
     * @return
     */
    public Composite createSentences (Composite compositeMain, List<Composite> cacheWords, Character character) {


        //+create sentense
        Composite compositeSentence = new Composite(Type.SENTENCE);
        Composite cacheLastComp = new Composite();

        Boolean firstElement = true;
        for (Composite i:cacheWords){

            if (firstElement & compositeMain.getElement().size()==0){
                compositeSentence.addComponent(i);
                firstElement = false;
                continue;
            }

            if (!(i.getType()==Type.PUNCTUATIONMARK)){
                compositeSentence.addComponent(PunctuationMark.SPACE);
            }

            compositeSentence.addComponent(i);

        }

        compositeMain.addComponent(compositeSentence);

        return compositeMain;
    }

    public List<Composite> createWord(FlyweightFactory flyweightFactory, List<Symbol> cacheSymbols, List<Composite>cacheWords, Character character, Boolean addLastSymbol){

        cacheWords.add(flyweightFactory.getWord(cacheSymbols));

        //add punctuation mark after word
        if (addLastSymbol & (PunctuationMark.getDelimiterAsChar(character) != PunctuationMark.SPACE)){

            Composite composite= new Composite(Type.PUNCTUATIONMARK);
            composite.addComponent(PunctuationMark.getDelimiterAsChar(character));
            cacheWords.add(composite);
        }


        return cacheWords;
    }
}


