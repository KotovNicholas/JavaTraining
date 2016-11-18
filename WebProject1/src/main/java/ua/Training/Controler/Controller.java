package ua.Training.Controler;

import ua.Training.Model.Disk;
import ua.Training.Model.Genre;
import ua.Training.Model.Soundman;
import ua.Training.Model.Track;
import ua.Training.View.View;

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

        ArrayList<Track> tracks = new ArrayList<>();
        Disk myCoolDisc;
        Integer lengthOfTracks = 0;
        ArrayList<Track> foundTracks = new ArrayList<>();


        tracks.add(new Track("Dead Man's Boots", Genre.PUNKROCK, "King and Jester", 159));
        tracks.add(new Track("On The Way To Ainor"           , Genre.POWERMETAL, "Rhapsody Of Fire", 417));
        tracks.add(new Track("Aces In Exile"  , Genre.POWERMETAL, "Sabaton", 262));
        tracks.add(new Track("Bohemian Rapsody"     , Genre.ROCK, "Queen", 352));
        tracks.add(new Track("Storm"     , Genre.CLASSIC, "Ludwig van Beethoven", 363));
        tracks.add(new Track("Bear"            , Genre.PUNKROCK, "King and Jester", 206));
        tracks.add(new Track("Primo Victoria ", Genre.POWERMETAL, "Sabaton", 272));
        tracks.add(new Track("Air" , Genre.CLASSIC, "Johann Christoph Bach", 222));
        tracks.add(new Track("Gargoyles, Angels Of Darkness ", Genre.POWERMETAL, "Rhapsody Of Fire", 1142));
        tracks.add(new Track("We Are The Champions" , Genre.ROCK, "Queen", 186));
        tracks.add(new Track("Jump Off a Cliff", Genre.PUNKROCK, "King and Jester", 121));
        tracks.add(new Track("Ghost Division" , Genre.POWERMETAL, "Sabaton", 231));
        tracks.add(new Track("Dead pirate"     , Genre.PUNKROCK, "King and Jester", 252));

        myCoolDisc = soundman.burnToDiscSongs("MyCoolDisc", tracks);

        lengthOfTracks = getTheLengthOfTheSongs(myCoolDisc);

        myCoolDisc = soundman.sortStyle(myCoolDisc);

        foundTracks = soundman.findSong(tracks, 200, 250);



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
    public Integer getTheLengthOfTheSongs(Disk disk){

        Integer length=0;
        ArrayList<Track> tracks = disk.getTracks();

        for (Track i: tracks){
            length+=i.getTrackLength();
        }

        return length;
    }




}
