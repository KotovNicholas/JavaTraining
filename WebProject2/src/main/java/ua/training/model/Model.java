package ua.training.model;

import ua.training.model.entity.Composite;

import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Model {

    public Model() {
    }

    public Composite ParceText(List<Character> text){
        return new ParceText().createCompositeFromText(text);
    }
}
