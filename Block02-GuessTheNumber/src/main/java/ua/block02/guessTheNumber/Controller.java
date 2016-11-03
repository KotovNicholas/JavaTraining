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

    public void newSecretValue(){

        if (checkRandom(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER)){
            model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
                    GlobalConstants.PRIMARY_MAX_BARRIER);
            model.setSecretValue();
        }else {
            model.setPrimaryBarrier(0,0);
            model.setSecretValue();
        }

    }

    public boolean checkRandom(int min, int max){

        Boolean result = false;

        checkStatement(min, max);

        if (min==Integer.MIN_VALUE & max>0 ){
            return result;
        }else if (max==Integer.MAX_VALUE & min<0 ){
            return result;
        }




        if ((min>=0) & (max-min)>(Integer.MAX_VALUE)){
            return result;
        }else if((min<0) & ((min-max)<(Integer.MIN_VALUE))){
            return result;
        }


        return true;
    }

    private Boolean checkStatement(int min, int max){

        if  (min<Integer.MIN_VALUE || max>Integer.MAX_VALUE ) {
            return false;
        }

        return true;
    }

    private Boolean checkRangeStatement(int min, int max){

        if  (min<Integer.MIN_VALUE || max>Integer.MAX_VALUE ) {
            return false;
        }

        return true;
    }
}
