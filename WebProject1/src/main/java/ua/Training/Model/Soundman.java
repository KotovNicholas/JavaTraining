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

    private Disk disk;

    public Soundman() {
    }

    public Soundman(String name) {
        this.name = name;
    }

    public Soundman(String name, Disk disk) {
        this.name = name;
        this.disk = disk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    /**
     * Rearrange songs in style
     * @return disc
     */
    public void sort (SortTrack sort){

        this.disk.setTracks((ArrayList<Track>) sortTrack(sort));

    }

    /**
     * get get sorted list by parameter
     * @param sort
     * @return list of tracks
     */
    public List<Track> sortTrack(SortTrack sort){
        List<Track> tracks = this.disk.getTracks();
        Collections.sort(tracks, Comparator.comparing(x -> x.getField(sort)));
        return tracks;
    }


        /**
         * Search tracks the length of playback
         *

         * @return songs
         */
    public ArrayList<Track> findSongDiapason(Integer diapasonSecFirst, Integer diapasonSecSecond) {
        List<Track> songs  = this.disk.getTracks();
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
    public void createToDiscSongs(String nameOfDisc, ArrayList<Track> tracks) {
        this.disk = new Disk(nameOfDisc, tracks);
    }

    /**
     * getting the length of the songs
     * @return length
     */
    public Integer getAllLengthSongs(){
        return getLengthSong(n -> true);
    }

    /**
     * get length song by predicate

     * @param p
     * @return
     */
    public Integer getLengthSong(Predicate<Integer> p){
        Integer length = 0;
        List<Track> tracks = this.disk.getTracks();

        for (Track i:tracks){
            if (p.test(i.getTrackLength())){
                length+=i.getTrackLength();
            }
        }

        return length;
    }



}
