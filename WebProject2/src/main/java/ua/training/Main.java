package ua.training;

import ua.training.controler.Controller;
import ua.training.controler.ReaderFile;
import ua.training.model.Model;
import ua.training.view.View;


/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();

        //System.out.println(new ReaderFile().readFile());

    }
}
