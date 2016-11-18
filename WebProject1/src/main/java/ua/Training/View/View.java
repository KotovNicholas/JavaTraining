package ua.Training.View;

import ua.Training.Model.Disk;
import ua.Training.Model.Track;

import java.util.ArrayList;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class View {

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

    /**
     *
     * @param disk
     */
    public void printDisk(Disk disk){
        System.out.println(disk.toString());
    }

    /**
     *
     * @param lengthOfTracks
     */
    public void printLengthOfTracks(Integer lengthOfTracks){
        int min = lengthOfTracks / 60;
        int sec = lengthOfTracks % 60;
        System.out.println("=====>Length of the songs: "+ min +" min "+ sec + "sec");
    }

    /**
     * print separator
     */
    public void printSeparator(){
        System.out.println("===============================================");
    }

    public void printTracks (ArrayList<Track> tracks){
        for (Track i : tracks) {System.out.println(i.toString());        }

    }





}
