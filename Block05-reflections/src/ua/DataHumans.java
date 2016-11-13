package ua;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kotov Nicholas on 13.11.2016.
 */
public class DataHumans {

    /**
     * Includes the current date
     */
    private String time;

    public DataHumans() {
        Date timeNow = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.time = dateFormat.format(timeNow);
    }

    public DataHumans(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataHumans that = (DataHumans) o;

        return time.equals(that.time);

    }

    @Override
    public int hashCode() {
        return time.hashCode();
    }

    @Override
    public String toString() {
        return "DataHumans{" +
                "time='" + time + '\'' +
                '}';
    }

}
