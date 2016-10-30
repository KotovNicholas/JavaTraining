package ua.block02.guessTheNumber.modal;

import ua.block02.guessTheNumber.controller.ControllerGame;
import ua.block02.guessTheNumber.view.Messages;
import ua.block02.guessTheNumber.view.ReaderAnswer;

import java.util.ArrayList;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
public class GameGuess {

    public GameGuess() {
    }

    public static void start(){



        int minNumber  = 0;
        int maxNumber  = 100;

        ArrayList <Integer> saveData = new ArrayList<Integer>();

        Integer minDiapason = minNumber;
        Integer maxDiapason = maxNumber;


        Integer data;
        String st = "";

        RandomForGames randomNumberClass = new RandomForGames();


        int numberRand = randomNumberClass.rand(minNumber,maxNumber);

        Messages.greeting();

        while (true){

            Messages.newLine();
            Messages.Diapason(minDiapason, maxDiapason);
            Messages.sendSaveData(saveData);
            st = ReaderAnswer.answerNumber();

            if (ControllerGame.controlExit(st)){
                Messages.sendLose(numberRand);
                break;
            }

            data = ControllerGame.controlAnswer(st, minNumber, maxNumber, minDiapason, maxDiapason);

            if (data == null){
                continue;
            }

            saveData.add(data);

            if (data > numberRand){
                Messages.sendBig();
                maxDiapason = data-1;
            }else if (data < numberRand){
                Messages.sendLittle();
                minDiapason = data+1;
            }else if (data.equals(numberRand)){

                Messages.sendCongratulations();
                Messages.sendStatistic(saveData);

                if (ReaderAnswer.answerGame()){
                    numberRand = randomNumberClass.rand(minNumber,maxNumber);
                    minDiapason = minNumber;
                    maxDiapason = maxNumber;
                }else {
                    Messages.bye();
                    break;
                }
            }

        }


    }

}
