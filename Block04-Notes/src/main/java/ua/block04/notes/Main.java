package ua.block04.notes;

/**
 * Created by Nicholas Kotov on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();


    }
}
