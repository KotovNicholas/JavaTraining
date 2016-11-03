package ua.block02.guessTheNumber;

import ua.block02.guessTheNumber.controller.ControllerRandom;

import java.util.Random;

/**
 * Created by Nicholas Kotov on 03.11.2016.
 */
public class Model {
    /**
     *
     */
    private int minBarrier;
    /**
     *
     */
    private int maxBarrier;
    /**
     *
     */
    private int secretValue;

    /**
     *
     */
    private static Random randomClass = new Random();

    /**
     *
     * @param value
     * @return
     */
    public boolean checkValue (int value){
        if (value == secretValue){
            return true;
        } else if (value > secretValue){
            maxBarrier = value;
        } else {
            minBarrier = value;
        }
      return false;
    }

    /**
     *
     * @param minBarrier
     * @param maxBarrier
     */
    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier; // check
        this.maxBarrier = maxBarrier;
    }

    /**
     *
     */
    public void setSecretValue() {
        secretValue = (int)Math.ceil(Math.random() * (maxBarrier - minBarrier -1) + minBarrier);

        secretValue = rand(minBarrier, maxBarrier);

    }

    public static int rand(){
        return rand(0,Integer.MAX_VALUE);
    }

    public static int rand(int min, int max){

        ControllerRandom checkRandom =  ControllerRandom.getThisClass();


        min = checkRandom.getMinCheck();
        max = checkRandom.getMaxCheck();

        int numberRand = randomClass.nextInt(max-min+1)+min;

        return numberRand;
    }



    public int getSecretValue() {
        return secretValue;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }
}
