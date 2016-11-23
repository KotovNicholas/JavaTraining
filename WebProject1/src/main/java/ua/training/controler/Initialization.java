package ua.training.controler;

import ua.training.model.Genre;
import ua.training.model.Track;

import java.util.ArrayList;

/**
 * Created by Kontov Nicholas on 23.11.2016.
 */
public class Initialization {

    public Initialization() {
    }

    public ArrayList<Track> getInitializationTRack(){
        ArrayList<Track> tracks = new ArrayList<>();

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

        return tracks;
    }
}
