package ua.model;

import ua.training.model.*;
import ua.training.view.View;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kontov Nicholas on 17.11.2016.
 */
public class Test {
    View view = new View();
    Soundman soundman = new Soundman("Test");

    @org.junit.Test
    public void testCreateDisk(){
        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track("test1Name", Genre.PUNKROCK, "testGroup1", 1));
        tracks.add(new Track("test2Name", Genre.POWERMETAL, "testGroup2", 2));

        soundman.createToDiscSongs("MyCoolDisc", tracks);

        assertEquals("Test create disk",  soundman.getDisk().getTracks().size(), 2);
        view.printSeparator();
        view.printMessage("Test create disk +");

    }

    @org.junit.Test
    public void testLengthSongs(){
        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track("test1Name", Genre.PUNKROCK, "testGroup1", 1));
        tracks.add(new Track("test2Name", Genre.POWERMETAL, "testGroup2", 2));
        tracks.add(new Track("test1Name", Genre.PUNKROCK, "testGroup1", 3));
        tracks.add(new Track("test2Name", Genre.POWERMETAL, "testGroup2", 4));

        soundman.createToDiscSongs("MyCoolDisc", tracks);
        int testLength = soundman.getAllLengthSongs();


        assertEquals("Test get length disk", testLength , 10);
        view.printSeparator();
        view.printMessage("Test get length disk = "+testLength);

    }

    @org.junit.Test
    public void testCheckSortStyle() throws Exception {
        ArrayList<Track> tracks = new ArrayList<>();
        Disk myCooTestDisc;



        tracks.add(new Track("CLASSIC" , Genre.CLASSIC, "", 1));
        tracks.add(new Track("PUNKROCK", Genre.PUNKROCK, "", 1));
        tracks.add(new Track("CLASSIC" , Genre.CLASSIC, "", 1));
        tracks.add(new Track("PUNKROCK", Genre.PUNKROCK, "", 1));


        soundman.createToDiscSongs("testDisc", tracks);
        soundman.sort(SortTrack.GENRE);

        view.printSeparator();
        view.printDisk(soundman.getDisk());

        assertEquals("Test sort style", soundman.getDisk().getTracks().get(0).getGenre().equals(Genre.CLASSIC), soundman.getDisk().getTracks().get(1).getGenre().equals(Genre.CLASSIC));

    }


    @org.junit.Test
    public void testFindSong() throws Exception {
        ArrayList<Track> tracks = new ArrayList<>();
        ArrayList<Track> foundTracks;



        tracks.add(new Track("10" , null, "", 10));
        tracks.add(new Track("55" , null, "", 55));
        tracks.add(new Track("70" , null, "", 70));
        tracks.add(new Track("100", null, "", 100));

        foundTracks = soundman.findSongDiapason( 50, 75);

        view.printSeparator();
        view.printTracks(foundTracks);

        assertEquals("Test find song", foundTracks.get(0).getTrackLength().equals(55), foundTracks.get(1).getTrackLength().equals(70));
    }



}
