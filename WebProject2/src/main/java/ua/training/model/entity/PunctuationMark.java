package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public enum PunctuationMark implements AllText {
    COMA(','), DOT('.'), QUESTION_MARK('?'), EXCLAMATION_MARK('!'), COLONS(':'), SEMICOLON(';'), DASH('-'), SPACE(' '), ;

    private Character character;
    private Type type = Type.PUNCTUATIONMARK;

    PunctuationMark(Character character) {
        this.character = character;
    }

    public Character getDelimiter(){
        return character;
    }

    public static PunctuationMark getDelimiterAsChar(Character c){
        for(PunctuationMark punctuationMark:values()){
            if(punctuationMark.getDelimiter().equals(c))
                return punctuationMark;
        }
        return null;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void show() {
        System.out.print(character);
    }

    public List<AllText> getElement() {
        List<AllText> result = new ArrayList<>();

        if (character=='.'){
            result.add(PunctuationMark.DOT);
            return result;
        }else if (character==','){
            result.add(PunctuationMark.COMA);
            return result;
        }else if (character=='?'){
            result.add(PunctuationMark.QUESTION_MARK);
            return result;
        }else if (character=='!'){
            result.add(PunctuationMark.EXCLAMATION_MARK);
            return result;
        }else if (character==':'){
            result.add(PunctuationMark.COLONS);
            return result;
        }else if (character==';'){
            result.add(PunctuationMark.SEMICOLON);
            return result;
        }else if (character=='-'){
            result.add(PunctuationMark.DASH);
            return result;
        }else if (character==' '){
            result.add(PunctuationMark.SPACE);
            return result;
        }


        return result;
    }

    @Override
    public List<Composite> getContentType(Type type) {
        List<Composite> allTextResult1 = new ArrayList<>();
        Composite comp = new Composite();
        if (this.type==type){
            comp.addComponent(this);
            allTextResult1.add(comp);
        }

        return allTextResult1;

    }

}
