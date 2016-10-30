package ua.block02.guessTheNumber.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
public class ReaderAnswer {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public ReaderAnswer() {
    }

    public static String answerNumber(){

        String st = "";

        System.out.print(Messages.question);

        try {
            st = reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        return st;
    }

    public static Boolean answerGame(){
        String YN = "";

        Messages.getQuestionContinue();

        try {
            YN = reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        if (YN.equals("y")){

           Messages.sendNewGame();

            return true;

          }else {
            return false;
        }
     }


}
