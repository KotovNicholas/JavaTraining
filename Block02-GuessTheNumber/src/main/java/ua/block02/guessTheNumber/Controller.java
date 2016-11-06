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

        newSecretValue();
        System.out.println(model.getSecretValue());

        view.greeting();

        while (!model.checkValue(inputIntValueWithScanner(sc))){

        }

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
        view.concatenationAndPrint(View.INPUT_INT_DATA, "" + model.getMinBarrier(), " to ", "" + model.getMaxBarrier());
        view.printMessage(view.QUESTION);

        while( true ) {
            // check int - value

            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
                sc.next();
            }

            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.WRONG_RANGE_DATA + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }

        return res;
    }





    /**
     * set new random value
     */
    public void newSecretValue(){

        if (checkRandom(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER)){
            model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
            model.setSecretValue();
        }else {
            model.setPrimaryBarrier(0,0);
            model.setSecretValue();
        }

    }

    /**
     * check random statement
     * @param min
     * @param max
     * @return
     */
    public boolean checkRandom(int min, int max){

        if  (checkMinMaxStatement(min, max) ) {
            return false;
        }else if (checkRangeStatement(min, max) ){
            return false;
        }

        return true;
    }

    /**
     *
     * min value should be bigger than Integer.MIN_VALUE
     * @param min value
     * max value should be less than Integer.MAX_VALUE
     * @param max value
     * @return
     */
    private Boolean checkMinMaxStatement(int min, int max){

        if  (min<Integer.MIN_VALUE || max>Integer.MAX_VALUE ) {
            return true;
        }

        return false;
    }

    /**
     *
     * check: range should be less than Integer.MAX_VALUE
     * @param min value
     * @param max value
     * @return
     */
    private Boolean checkRangeStatement(int min, int max){

        if ((max-min)>Integer.MAX_VALUE){
            return true;
        }

        return false;
    }

}
