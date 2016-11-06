package ua.block02.guessTheNumber;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Nicholas Kotov on 03.11.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "You have diapason from ";
    public static final String WRONG_INPUT_INT_DATA = "You should use only Integer number. Try again ";
    public static final String WRONG_RANGE_DATA = " Your range is wrong. Try again ";
    public static final String CONGRATULATION = "My congratulations!!!!!!! You guessed number";
    public static final String CASE = "You should try guess the number from 0 to 100";
    public static final String Hello = "Hello!";
    public static final String Hello2 = "You don't know me, but I know you. I want to play a game.";
    public static final String QUESTION = "Enter the number -> ";
    public static final String ANSWEREXIT = "You're a lose, correct number: ";


    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     *
     * @param message
     */
    public void concatenationAndPrint(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
        //System.out.println(concatString);
    }



    public void greeting() {
        String computername= "User";
        try {
            computername = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
        }

        concatenationAndPrint(Hello," ", computername, " ", Hello2);
        concatenationAndPrint(CASE);

    }

}
