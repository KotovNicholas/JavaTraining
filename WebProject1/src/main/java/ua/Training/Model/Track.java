package ua.Training.Model;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Track {

    /**
     * name of Track
     */
    private String name;

    /**
     * genre of music
     */
    private Genre genre;

    /**
     * group of Track
     */
    private String group;

    /**
     * track Length
     */
    private Integer trackLength;

    public Track() {
    }

    public Track(String name, Genre genre, String group, Integer trackLength) {
        this.name = name;
        this.genre = genre;
        this.group = group;
        this.trackLength = trackLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Integer trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (!name.equals(track.name)) return false;
        if (!group.equals(track.group)) return false;
        return trackLength.equals(track.trackLength);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + group.hashCode();
        result = 31 * result + trackLength.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Track{\n" +
                "name='" + name + ", \n" +
                "genre='" + genre + ", \n" +
                "group='" + group + ", \n" +
                "trackLength=" + trackLength+ '\n' +
                '}';
    }
}
