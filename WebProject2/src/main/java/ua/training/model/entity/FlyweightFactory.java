package ua.training.model.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class FlyweightFactory {
    private static final Map<Character, Symbol> symbols = new HashMap<>();
    private static final Map<List<Symbol>, Composite> symbolCompositeWord = new HashMap<>();
    private static final List<Composite> compositeWord = new ArrayList<>();
   // private static final List<Composite> componentsSentence = new ArrayList<>();

    public Symbol getSymbol(Character character){

        Symbol symbol = symbols.get(character);
        if (symbol==null){
            symbol = new Symbol(character);

            symbols.put(character, symbol);
        }
        return symbol;
    }



    public String toStringSymbol() {
        String st="";

        for (Map.Entry<Character, Symbol> pair : symbols.entrySet()) {
            st = st+ pair.getKey() + pair.getValue()+"\n";
        }

        return st;
    }

    public Composite getWord(List<Symbol> symbols){

        Composite word = symbolCompositeWord.get(symbols);
        if (word==null){
            word = new Composite(Type.WORD);

            for (Symbol s:symbols){
                word.addComponent(s);
            }

            symbolCompositeWord.put(symbols, word);
        }
        return word;
    }


    public String toStringWord() {
        String st="";

        for (Map.Entry<List<Symbol>, Composite> pair : symbolCompositeWord.entrySet()) {
            st = st+ pair.getKey() + pair.getValue()+"\n";
        }

        return st;
    }



}
