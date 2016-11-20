package ua.training.model;

import ua.training.model.entity.aTrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Soundman {

    /**
     * Name of soundman
     */
    private String name;

    public Soundman() {
    }

    public Soundman(String name) {
        this.name = name;
    }

    /**
     * sort tracks
      * @param disk
     * @param sort
     * @return
     */
    public Disk sortTracks (Disk disk, sortTrack sort){

        ArrayList<aTrack> tracks = disk.getTracks();
        Collections.sort(tracks, Comparator.comparing(x -> x.getField(sort)));
        disk.setTracks(tracks);

        return disk;
    }



    /**
     *
     * @param list
     * @param predicate
     * @return
     */
    public static ArrayList<aTrack> findSongPredicate(List<aTrack> list, Predicate<Integer> predicate) {
        ArrayList<aTrack> result = new ArrayList<>();

        for(aTrack n: list)  {
            if(predicate.test(n.getTrackLength())) {
                result.add(n);
            }
        }

        return result;
    }


    /**
     * create to disc songs
     *
     * @param nameOfDisc
     * @param tracks
     * @return Disk
     */
    public Disk createToDiscSongs(String nameOfDisc, ArrayList<aTrack> tracks) {
        return new Disk(nameOfDisc, tracks);
    }


}
