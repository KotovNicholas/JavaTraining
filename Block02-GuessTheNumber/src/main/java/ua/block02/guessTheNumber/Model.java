package ua.block02.guessTheNumber;

import ua.block02.guessTheNumber.controller.ControllerRandom;

import java.util.Random;

/**
 * Created by Nicholas Kotov on 03.11.2016.
 */
public class Model {
    /**
     *min barrier of range
     */
    private int minBarrier;
    /**
     *max barrier of range
     */
    private int maxBarrier;
    /**
     *random number
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

        rand(minBarrier, maxBarrier);

    }

    public void rand(){
        rand(0,Integer.MAX_VALUE);
    }

    public void rand(int min, int max){

        Random randomClass = new Random();

        secretValue = randomClass.nextInt(maxBarrier - minBarrier -1)+minBarrier;

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
