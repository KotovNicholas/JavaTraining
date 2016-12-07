package ua.training.controler;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.List;

/**
 * Created by Plavun on 05.12.2016.
 */
public class Controller {
    Model model;
    View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        List<Character> text = new ReaderFile().readFile();
        model.createSentence(text);

    }
}
