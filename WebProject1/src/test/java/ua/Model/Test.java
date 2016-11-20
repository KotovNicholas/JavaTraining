package ua.model;

import ua.training.model.Disk;
import ua.training.model.Soundman;
import ua.training.model.entity.Classic;
import ua.training.model.entity.PunkRock;
import ua.training.model.entity.aTrack;
import ua.training.model.sortTrack;
import ua.training.view.View;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kontov Nicholas on 17.11.2016.
 */
public class Test {

    @org.junit.Test
    public void testCheckSortStyle() throws Exception {
        ArrayList<aTrack> tracks = new ArrayList<>();
        Disk testDisc;
        Soundman soundman = new Soundman("Test");
        View view = new View();

        tracks.add(new Classic("CLASSIC" , "", 1));
        tracks.add(new PunkRock("PUNKROCK", "", 1));
        tracks.add(new Classic("CLASSIC" ,  "", 1));
        tracks.add(new PunkRock("PUNKROCK", "", 1));


        testDisc = soundman.createToDiscSongs("testDisc", tracks);
        testDisc = soundman.sortTracks(testDisc, sortTrack.GENRE);

        view.printSeparator();
        view.printDisk(testDisc);

//        if (testDisc.getTracks().get(0).getGenre().equals(Genre.PUNKROCK) & testDisc.getTracks().get(1).getGenre().equals(Genre.PUNKROCK)){
//            assertEquals("Test sort style", 5, 5);
//        }else{
//            assertEquals("Test sort style", 4, 5);
//        }
        //assertEquals("Test sort style", testDisc.getTracks().get(0).getClass(), testDisc.getTracks().get(1).getClass());
    }


    @org.junit.Test
    public void testFindSong() throws Exception {
        ArrayList<aTrack> tracks = new ArrayList<>();
        ArrayList<aTrack> foundTracks;
        Soundman soundman = new Soundman("Test");
        View view = new View();

        tracks.add(new PunkRock("10" , "", 10));
        tracks.add(new PunkRock("55" ,"", 55));
        tracks.add(new PunkRock("70" ,  "", 70));
        tracks.add(new PunkRock("100","", 100));

        foundTracks = soundman.findSongPredicate(tracks, (n) -> ((n > 50) & (n < 75)));

        view.printSeparator();
        view.printTracks(foundTracks);

        if (foundTracks.get(0).getTrackLength().equals(55) & foundTracks.get(1).getTrackLength().equals(70)){
            assertEquals("Test find song", 5, 5);
        }else{
            assertEquals("Test find song", 4, 5);
        }

    }


}
