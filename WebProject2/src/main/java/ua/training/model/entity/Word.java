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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return word.equals(word.word);

    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return "Word{" +
                "symbols=" + word +
                '}';
    }

}
