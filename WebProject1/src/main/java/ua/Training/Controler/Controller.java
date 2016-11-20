package ua.training.controler;

import ua.training.model.Disk;
import ua.training.model.Soundman;
import ua.training.model.entity.*;
import ua.training.model.sortTrack;
import ua.training.view.View;

import java.util.ArrayList;
import java.util.function.Predicate;

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

        ArrayList<aTrack> tracks = new ArrayList<>();
        Disk myCoolDisc;
        Integer lengthOfTracks = 0;
        ArrayList<aTrack> foundTracks = new ArrayList<>();

        tracks = startInititalization();

        myCoolDisc = soundman.createToDiscSongs("MyCoolDisc", tracks);

        lengthOfTracks = getTheLengthOfTheSongs(myCoolDisc, n -> true);

        myCoolDisc = soundman.sortTracks(myCoolDisc, sortTrack.GENRE);

        foundTracks = soundman.findSongPredicate(tracks, (n) -> ((n > 200) & (n < 250)));


        //view
        view.printDisk(myCoolDisc);

        view.printLengthOfTracks(lengthOfTracks);

        view.printSeparator();

        view.printTracks(foundTracks);



    }

    /**
     * getting the length of the songs
     * @param disk
     * @return length
     */
    public Integer getTheLengthOfTheSongs(Disk disk, Predicate<Integer> p){

        Integer length=0;
        ArrayList<aTrack> tracks = disk.getTracks();

        for (aTrack i: tracks){
            if (p.test(i.getTrackLength())) {
                length+=i.getTrackLength();
            }

        }

        return length;
    }

    private ArrayList<aTrack> startInititalization(){
        ArrayList<aTrack> tracks = new ArrayList<>();
        tracks.add(new PunkRock("Dead Man's Boots", "King and Jester", 159));
        tracks.add(new PowerMetal("On The Way To Ainor" , "Rhapsody Of Fire", 417));
        tracks.add(new PowerMetal("Aces In Exile" , "Sabaton", 262));
        tracks.add(new Rock("Bohemian Rapsody"  , "Queen", 352));
        tracks.add(new Classic("Storm"  , "Ludwig van Beethoven", 363));
        tracks.add(new PunkRock("Bear"         , "King and Jester", 206));
        tracks.add(new PowerMetal("Primo Victoria ", "Sabaton", 272));
        tracks.add(new Classic("Air", "Johann Christoph Bach", 222));
        tracks.add(new PowerMetal("Gargoyles, Angels Of Darkness ", "Rhapsody Of Fire", 1142));
        tracks.add(new Rock("We Are The Champions" , "Queen", 186));
        tracks.add(new PunkRock("Jump Off a Cliff",  "King and Jester", 121));
        tracks.add(new PowerMetal("Ghost Division" , "Sabaton", 231));
        tracks.add(new PunkRock("Dead pirate"     ,  "King and Jester", 252));

        return tracks;
    }



}
