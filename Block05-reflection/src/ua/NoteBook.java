package ua;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kotov Nicholas on 13.11.2016.
 */
public class NoteBook extends DataHumans {
     //производный класс - «записная книжка», включающий ФИО, телефон, дату рождения и функцию вычисления количества дней до дня рождения;

    private String firstSecondFamilyNames;
    private String phoneNumber;
    private String birthDay;


    public NoteBook() {
    }

    public NoteBook(String phoneNumber, String birthDay, String firstSecondFamilyNames) {
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.firstSecondFamilyNames = firstSecondFamilyNames;
    }

    public String getFirstSecondFamilyNames() {
        return firstSecondFamilyNames;
    }

    public void setFirstSecondFamilyNames(String firstSecondFamilyNames) {
        this.firstSecondFamilyNames = firstSecondFamilyNames;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        NoteBook noteBook = (NoteBook) o;

        if (!firstSecondFamilyNames.equals(noteBook.firstSecondFamilyNames)) return false;
        if (!phoneNumber.equals(noteBook.phoneNumber)) return false;
        return birthDay.equals(noteBook.birthDay);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + firstSecondFamilyNames.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + birthDay.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "firstSecondFamilyNames='" + firstSecondFamilyNames + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }


    /**
     *calculate the number of days before the birthday
     * @return
     */
    public long countDaysBeforeBday() {

        DataHumans currentDate = new DataHumans();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateBirthDay = null;
        Date dateCurrentDay = null;

        try {
            dateBirthDay = format.parse(birthDay);
            dateCurrentDay = format.parse(currentDate.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = dateBirthDay.getTime() - dateCurrentDay.getTime();
        long days = difference / (24 * 60 * 60 * 1000);
        if (days <= 0) {
            days += 365;
        }
        return days;
    }
}
