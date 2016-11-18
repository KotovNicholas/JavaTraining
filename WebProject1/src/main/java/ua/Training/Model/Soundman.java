package ua.Training.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    public Disk sortStyle (Disk disk){

        ArrayList<Track> tracks = disk.getTracks();

        Collections.sort(tracks, new Comparator<Track>() {
            public int compare(Track o1, Track o2) {
                return o1.getGenre().compareTo(o2.getGenre());
            }

        });

        disk.setTracks(tracks);

        return disk;


    }

    /**
     * Search tracks the length of playback
     *
     * @param songs - tracks for search
     * @return songs
     */
    public ArrayList<Track> findSong(ArrayList<Track> songs, Integer diapasonSecFirst, Integer diapasonSecSecond) {

        ArrayList<Track> result = new ArrayList<>();
        Integer diapasonCurrent;
        for (Track i : songs){
            diapasonCurrent = i.getTrackLength();
            if (diapasonCurrent>diapasonSecFirst & diapasonCurrent<diapasonSecSecond){
                result.add(i);
            }
        }


        return result;
    }

    /**
     * Burn to disc songs
     *
     * @param nameOfDisc
     * @param tracks
     * @return Disk
     */
    public Disk burnToDiscSongs(String nameOfDisc, ArrayList<Track> tracks) {
        return new Disk(nameOfDisc, tracks);
    }


}
