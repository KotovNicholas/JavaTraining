package ua.Training;

import ua.Training.Controler.Controller;
import ua.Training.Model.Soundman;
import ua.Training.View.View;

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
