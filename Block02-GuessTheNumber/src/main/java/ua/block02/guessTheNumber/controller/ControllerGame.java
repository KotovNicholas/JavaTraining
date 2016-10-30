package ua.block02.guessTheNumber.controller;

import ua.block02.guessTheNumber.view.Messages;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
public class ControllerGame {

    public ControllerGame() {
    }

    public static Boolean controlExit(String st){
        if (st.equals("exit")){
            return true;
         }
        return false;
    }

   public static Integer controlAnswer(String st, Integer minNumber, Integer maxNumber, Integer minDiapason, Integer maxDiapason){

       Integer data;

        try {
            data = Integer.parseInt(st);
        } catch (NumberFormatException ex01){
            Messages.sendOnlyIInteger();
            return null;
        }

        if (!ControllerGame.controlDiapason(data, minDiapason, maxDiapason)){
            Messages.sendWrongRange();
            return null;
        }

       return data;
   }

   public static Boolean controlDiapason(Integer data, Integer minDiapason, Integer maxDiapason){

       if ((data>maxDiapason)|(data<minDiapason)){

           return false;
       }


       return true;
   }

}
