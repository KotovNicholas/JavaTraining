package ua.training.model.entity;

import ua.training.model.sortTrack;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public class Classic extends aTrack {

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

    public Classic() {
    }

    public Classic(String name, String group, Integer trackLength) {
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

        Classic classic = (Classic) o;

        if (!name.equals(classic.name)) return false;
        if (!group.equals(classic.group)) return false;
        return trackLength.equals(classic.trackLength);

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
        return "\nClassic{" +
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
            case GENRE: return "Classic";
            case LENGTH: return String.valueOf(getTrackLength());
        }

        return null;
    }

}
