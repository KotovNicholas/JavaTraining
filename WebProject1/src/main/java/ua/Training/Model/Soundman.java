package ua.training.model;

import org.omg.CORBA.TRANSACTION_MODE;

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
     * Rearrange songs in style
     * @param disk - Disc where the compositions changes
     * @return disc
     */
    public Disk sort (Disk disk, SortTrack sort){

        disk.setTracks(sortTrack(disk, sort));
        return disk;

    }

    /**
     * get get sorted list by parameter
     * @param disk
     * @param sort
     * @return list of tracks
     */
    public ArrayList<Track> sortTrack(Disk disk, SortTrack sort){
        ArrayList<Track> tracks = disk.getTracks();
        Collections.sort(tracks, Comparator.comparing(x -> x.getField(sort)));
        return tracks;
    }


        /**
         * Search tracks the length of playback
         *
         * @param songs - tracks for search
         * @return songs
         */
    public ArrayList<Track> findSongDiapason(ArrayList<Track> songs, Integer diapasonSecFirst, Integer diapasonSecSecond) {

        return findSongPredicate(songs, (n) -> ((n>=diapasonSecFirst) & (n<diapasonSecSecond)));
    }

    public ArrayList<Track> findSongPredicate(List<Track> list, Predicate<Integer> predicate){
        ArrayList<Track> result = new ArrayList<>();

        for (Track n:list){
            if (predicate.test(n.getTrackLength())){
                result.add(n);
            }
        }

        return result;
    }

    /**
     * Create to disc songs
     *
     * @param nameOfDisc
     * @param tracks
     * @return Disk
     */
    public Disk createToDiscSongs(String nameOfDisc, ArrayList<Track> tracks) {
        return new Disk(nameOfDisc, tracks);
    }

    /**
     * getting the length of the songs
     * @param disk
     * @return length
     */
    public Integer getAllLengthSongs(Disk disk){
        return getLengthSong(disk, n -> true);
    }

    /**
     * get length song by predicate
     * @param disc
     * @param p
     * @return
     */
    public Integer getLengthSong(Disk disc, Predicate<Integer> p){
        Integer length = 0;
        ArrayList<Track> tracks = disc.getTracks();

        for (Track i:tracks){
            if (p.test(i.getTrackLength())){
                length+=i.getTrackLength();
            }
        }

        return length;
    }



}
