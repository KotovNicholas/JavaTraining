package ua.block02.guessTheNumber;

import ua.block02.guessTheNumber.modal.GameGuess;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) {

       /*GameGuess newGame = new GameGuess();
        newGame.start();*/

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();

    }
}
