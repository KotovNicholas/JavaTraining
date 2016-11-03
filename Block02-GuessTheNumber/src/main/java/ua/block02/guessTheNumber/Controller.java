package ua.block02.guessTheNumber;

import java.util.Scanner;

/**
 * Created by Nicholas Kotov on 03.11.2016.
 */
public class Controller {
    Model model;
    View  view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
                                GlobalConstants.PRIMARY_MAX_BARRIER);
        model.setSecretValue();
        System.out.println(model.getSecretValue());

        while (!model.checkValue(inputIntValueWithScanner(sc))){}

        view.printMessage(View.CONGRATULATION + model.getSecretValue());
    }

    // The Utility methods

    /**
     *
     * @param sc
     * @return
     */
    public int inputIntValueWithScanner(Scanner sc) {
        int res=0;
        view.printMessage(View.INPUT_INT_DATA +
                model.getMinBarrier() + model.getMaxBarrier());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }
}
