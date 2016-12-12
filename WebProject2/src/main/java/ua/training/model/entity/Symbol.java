package ua.training.model.entity;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Symbol  implements Components {
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

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol = (Symbol) o;

        if (!character.equals(symbol.character)) return false;
        return type == symbol.type;

    }

    @Override
    public int hashCode() {
        int result = character.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "character=" + String.valueOf(character) +
                '}';
    }

    @Override
    public void PrintText() {
        System.out.print(character.toString());
    }
}
