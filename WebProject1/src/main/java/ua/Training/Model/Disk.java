package ua.training.model;

import java.util.ArrayList;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Disk {

    /**
     * Name of Disk
     */
    private String name;

    /**
     * tracks of disc
     */
    private ArrayList<Track> tracks;

    public Disk() {
    }

    public Disk(String name, ArrayList<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disk disk = (Disk) o;

        if (!name.equals(disk.name)) return false;
        return tracks.equals(disk.tracks);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + tracks.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "name='" + name + '\n' +
                ", tracks=\n" + tracks +
                '}';
    }





}
