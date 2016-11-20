package ua.training.model.entity;

import ua.training.model.sortTrack;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Rock extends aTrack {

    /**
     * name of Track
     */
    private String name;

    /**
     * group of Track
     */
    private String group;

    /**
     * track Length
     */
    private Integer trackLength;

    public Rock() {
    }

    public Rock(String name, String group, Integer trackLength) {
        this.name = name;
        this.group = group;
        this.trackLength = trackLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
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

        Rock rock = (Rock) o;

        if (!name.equals(rock.name)) return false;
        if (!group.equals(rock.group)) return false;
        return trackLength.equals(rock.trackLength);

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
        return "\nRock{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", trackLength=" + trackLength +
                '}';
    }

    /**
     * return field class for sort
     * @param s
     * @return
     */
    public String getField(sortTrack s){
        switch ( s )
        {
            case NAME: return getName();
            case GROUP: return getGroup();
            case GENRE: return "Rock";
            case LENGTH: return String.valueOf(getTrackLength());
        }

        return null;
    }
}
