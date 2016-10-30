package ua.block02.guessTheNumber.controller;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
public class ControllerRandom {

    private int minCheck;
    private int maxCheck;
    public static ControllerRandom thisClass = new ControllerRandom();

    public ControllerRandom() {
    }

    private void checkStatement(int min, int max){
        this.minCheck = min;
        this.maxCheck = max;

        if  (min==Integer.MIN_VALUE ){
            this.minCheck = Integer.MIN_VALUE+2;
        }else if (max==Integer.MAX_VALUE ){
            this.maxCheck = Integer.MAX_VALUE-1;
        }
    }

    public boolean checkRandom(int min, int max){

        Boolean result = false;

        if (min==Integer.MIN_VALUE & max>0 ){
            return result;
        }else if (max==Integer.MAX_VALUE & min<0 ){
            return result;
        }


        checkStatement(min, max);

        if ((min>=0) & (max-min)>(Integer.MAX_VALUE)){
            return result;
        }else if((min<0) & ((min-max)<(Integer.MIN_VALUE))){
            return result;
        }


        return true;
    }

    public int getMinCheck() {
        return minCheck;
    }

    public int getMaxCheck() {
        return maxCheck;
    }

    public static ControllerRandom getThisClass() {
        return thisClass;
    }
}

