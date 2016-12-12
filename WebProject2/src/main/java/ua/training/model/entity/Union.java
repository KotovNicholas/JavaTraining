package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Union {

    private Type type;

    private Character character;
    private List<Components> word;
    private List<Components> sentence;

    public Union() {
    }

    public Union(Type type, Character character, List<Components> word, List<Components> sentence) {
        this.type = type;
        this.character = character;
        this.word = word;
        this.sentence = sentence;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Components> getWord() {
        return word;
    }

    public void setWord(List<Components> word) {
        this.word = word;
    }

    public List<Components> getSentence() {
        return sentence;
    }

    public void setSentence(List<Components> sentence) {
        this.sentence = sentence;
    }


}
