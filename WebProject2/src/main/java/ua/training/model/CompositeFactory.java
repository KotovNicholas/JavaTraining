package ua.training.model;

import ua.training.model.entity.Components;
import ua.training.model.entity.Sentence;
import ua.training.model.entity.Symbol;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class CompositeFactory {
    private static final Map<Character, Components> components = new HashMap<>();

    public Components getComponent(String nameClass, Character character) {

        Components component = components.get(character);
        if (component == null) {

            switch (nameClass){
                case "symbol":
                    component = new Symbol(character);
                    break;
                case "word":
                    component = new Symbol(character);
                    break;
            }
            components.put(character, component);
        }

        return component;
    }
}
