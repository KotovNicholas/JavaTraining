package ua.training;

import ua.training.controler.Controller;
import ua.training.model.Soundman;
import ua.training.view.View;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Soundman soundman = new Soundman("Bob");
        View view = new View();
        Controller controller = new Controller(soundman, view);
        // Run
        controller.processUser();

    }
}
