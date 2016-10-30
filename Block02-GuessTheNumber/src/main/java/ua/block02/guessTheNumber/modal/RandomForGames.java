package ua.block02.guessTheNumber.modal;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
import ua.block02.guessTheNumber.controller.ControllerRandom;

import java.util.Random;

public class RandomForGames {

    private static Random randomClass = new Random();

    public RandomForGames() {
    }

    public static int rand(){
        return RandomForGames.rand(0,Integer.MAX_VALUE);
    }

    public static int rand(int min, int max){

        ControllerRandom checkRandom =  ControllerRandom.getThisClass();

        if (!checkRandom.checkRandom(min, max)){
           return 0;
        }

        min = checkRandom.getMinCheck();
        max = checkRandom.getMaxCheck();

        int numberRand = randomClass.nextInt(max-min+1)+min;

        return numberRand;
    }

}
