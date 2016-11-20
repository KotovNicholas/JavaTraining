package ua.training.model.entity;

import ua.training.model.sortTrack;

/**
 * Created by Kontov Nicholas on 16.11.2016.
 */
public interface iTrack {

    /**
     * get track length
     * @return
     */
    Integer getTrackLength();

    /**
     * get field for sort
     * @param s
     * @return
     */
     String getField(sortTrack s);

}
