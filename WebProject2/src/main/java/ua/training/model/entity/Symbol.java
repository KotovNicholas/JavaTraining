package ua.training.model.entity;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Symbol  implements Components {
    private Character character;

    public Symbol() {
    }

    public Symbol(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
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
}
