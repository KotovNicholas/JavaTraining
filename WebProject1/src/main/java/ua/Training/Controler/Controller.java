package ua.training.controler;

import ua.training.model.*;
import ua.training.view.View;

import java.util.ArrayList;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Controller {

    Soundman soundman;
    View view;


    public Controller() {
    }

    public Controller(Soundman soundman, View view) {
        this.soundman = soundman;
        this.view = view;
    }

    /**
     *The Work method
     */
    public void processUser(){

        ArrayList<Track> tracks;
        Disk myCoolDisc;
        Integer lengthOfTracks = 0;
        ArrayList<Track> foundTracks = new ArrayList<>();

        tracks = new Initialization().getInitializationTRack();

        soundman.createToDiscSongs("MyCoolDisc", tracks);

        lengthOfTracks = soundman.getAllLengthSongs();

        soundman.sort(SortTrack.GENRE);

        foundTracks = soundman.findSongDiapason(200, 250);



        //view
        view.printDisk(soundman.getDisk());

        view.printLengthOfTracks(lengthOfTracks);

        view.printSeparator();

        view.printTracks(foundTracks);



    }





}
