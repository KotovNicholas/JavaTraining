package ua.training.model.entity;

import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Word  implements Components {

    /**
     * symbols of word
     */
    private List<Symbol> word;

    private Type type = Type.WORD;

    public Word() {
    }

    public Word(List<Symbol> symbols) {
        this.word = symbols;
    }

    public List<Symbol> getSymbols() {
        return word;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.word = symbols;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        if (!word.equals(word1.word)) return false;
        return type == word1.type;

    }

    @Override
    public int hashCode() {
        int result = word.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word=" + word +
                '}';
    }
}