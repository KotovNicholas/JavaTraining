package ua.block02.guessTheNumber.view;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 * Created by Nicholas Kotov on 30.10.2016.
 */
public class Messages {

    public static final String question = "Enter the number -> ";
    public static final String answerExit = "You're a lose, correct number: ";

    public Messages() {
    }

    public static void greeting() {
        String computername= "User";
        try {
            computername = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
        }
        System.out.println("Hello, "+computername+". You don't know me, but I know you. I want to play a game. ");
        System.out.println("You should try guess the number from 0 to 100");
    }

    public static void sendLose(int numberrand) {
        System.out.println(Messages.answerExit + numberrand);
    }

    public static void sendOnlyIInteger(){
        System.out.println("You should use only Integer number. Try again");
    }

    public static void sendWrongRange(){
        System.out.println("Your diapason is wrong. Try again");
    }

    public static void sendLittle(){
        System.out.println("You made a mistake. Your number is little!!! Try again");
    }

    public static void sendBig(){
        System.out.println("You made a mistake. Your number is big!!! Try again");
    }

    public static void sendCongratulations(){
        System.out.println("------------------------------");
        System.out.println("My congratulations!!!!!!! You guessed number");
    }

    public static void getQuestionContinue(){
        System.out.println("Would you like to play from the beginning? (y/n)");
    }

    public static void sendNewGame(){
        System.out.println("------------------------------");
        System.out.println();
        Messages.greeting();
    }

    public static void bye(){
        System.out.println("This is not the end! Goodbye");
    }

    public static void Diapason(Integer minDiapason, Integer maxDiapason ){
        System.out.println("You have diapason from "+minDiapason+" to "+maxDiapason);
    }

    public static void sendSaveData(ArrayList<Integer> saveData){
        System.out.print("Your previous tries: ");
        for (int st:saveData){
            System.out.print(st+" ");
        }
        System.out.println();
    }

    public static void newLine(){
        System.out.println("------------------------");
        System.out.println();
    }

    public static void sendStatistic(ArrayList<Integer> saveData){
        System.out.println("------------------------------");
        System.out.println("You guessed the number of " + saveData.size() + " tries");
        System.out.print("Your tries: ");
        for (int st:saveData){
            System.out.print(st+" ");
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
    }

}
