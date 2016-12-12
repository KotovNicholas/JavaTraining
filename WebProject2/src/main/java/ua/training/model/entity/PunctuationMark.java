package ua.training.model.entity;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public enum PunctuationMark implements Components {
    COMA(','), DOT('.'), QUESTION_MARK('?'), EXCLAMATION_MARK('!'), COLONS(':'), SEMICOLON(';'), DASH('-'), SPACE(' ');

    private Character character;

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
    public String toString() {
        return super.toString();
    }

    @Override
    public void PrintText() {
        System.out.print(super.toString());

    }
}

