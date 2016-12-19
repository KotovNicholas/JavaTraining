package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Symbol implements AllText {
    private Character character;
    private Type type = Type.SYMBOL;

    public Symbol() {
    }

    public Symbol(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol = (Symbol) o;

        return character.equals(symbol.character);

    }

    @Override
    public int hashCode() {
        return character.hashCode();
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "character=" + character +
                '}';
    }



    public void show() {
        System.out.print(character);
    }

    public List<AllText> getElement() {
        List<AllText> result = new ArrayList<>();
        result.add(this);
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
