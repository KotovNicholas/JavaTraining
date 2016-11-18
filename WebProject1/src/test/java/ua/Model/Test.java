package ua.Model;

import ua.Training.Model.Disk;
import ua.Training.Model.Genre;
import ua.Training.Model.Soundman;
import ua.Training.Model.Track;
import ua.Training.View.View;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kontov Nicholas on 17.11.2016.
 */
public class Test {

    @org.junit.Test
    public void testCheckSortStyle() throws Exception {
        ArrayList<Track> tracks = new ArrayList<>();
        Disk testDisc;
        Soundman soundman = new Soundman("Test");
        View view = new View();

        tracks.add(new Track("CLASSIC" , Genre.CLASSIC, "", 1));
        tracks.add(new Track("PUNKROCK", Genre.PUNKROCK, "", 1));
        tracks.add(new Track("CLASSIC" , Genre.CLASSIC, "", 1));
        tracks.add(new Track("PUNKROCK", Genre.PUNKROCK, "", 1));


        testDisc = soundman.burnToDiscSongs("testDisc", tracks);
        testDisc = soundman.sortStyle(testDisc);

        view.printSeparator();
        view.printDisk(testDisc);

        if (testDisc.getTracks().get(0).getGenre().equals(Genre.PUNKROCK) & testDisc.getTracks().get(1).getGenre().equals(Genre.PUNKROCK)){
            assertEquals("Test sort style", 5, 5);
        }else{
            assertEquals("Test sort style", 4, 5);
        }

    }


    @org.junit.Test
    public void testFindSong() throws Exception {
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<Track> foundTracks;
        Soundman soundman = new Soundman("Test");
        View view = new View();

        tracks.add(new Track("10" , null, "", 10));
        tracks.add(new Track("55" , null, "", 55));
        tracks.add(new Track("70" , null, "", 70));
        tracks.add(new Track("100", null, "", 100));

        foundTracks = soundman.findSong(tracks, 50, 75);

        view.printSeparator();
        view.printTracks(foundTracks);

        if (foundTracks.get(0).getTrackLength().equals(55) & foundTracks.get(1).getTrackLength().equals(70)){
            assertEquals("Test find song", 5, 5);
        }else{
            assertEquals("Test find song", 4, 5);
        }

    }


}
