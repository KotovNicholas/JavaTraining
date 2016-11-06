package ua.block04.notes;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Nicholas Kotov on 06.11.2016.
 */
public class NoteBook{

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String secondName;

    /**
     *
     */
    private String petronymic;

    /**
     *
     */
    private String shortName;

    /**
     *
     */
    private String nickName;

    /**
     *
     */
    private String comment;

    /**
     *
     */
    private String groups;

    /**
     *
     */
    private String phoneHouse;

    /**
     *
     */
    private String mobPhone;

    /**
     *
     */
    private String mobPhone2;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String skype;

    /**
     *
     */
    private String addressIndex;

    /**
     *
     */
    private String addressCity;

    /**
     *
     */
    private String addressStreet;

    /**
     *
     */
    private String addressHouseNumber;

    /**
     *
     */
    private String addressApartmentNumber;

    /**
     *
     */
    private String fullAddress;

    /**
     *
     */
    private String datesOfEntry;

    /**
     *
     */
    private String datesLastChange;

    public NoteBook() {
    }

    public NoteBook(LinkedHashMap <String ,String> map) {
        setParameters(map);
    }

    /**
     *
     * @param map
     */
    public void setParameters(LinkedHashMap<String ,String> map){


        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();


            if (pair.getKey().equals("name")) this.name = pair.getValue();
            else if (pair.getKey().equals("secondName")) this.secondName = pair.getValue();
            else if (pair.getKey().equals("petronymic")) this.petronymic = pair.getValue();
            else if (pair.getKey().equals("shortName")) this.shortName = pair.getValue();
            else if (pair.getKey().equals("nickName")) this.nickName = pair.getValue();
            else if (pair.getKey().equals("comment")) this.comment = pair.getValue();
            else if (pair.getKey().equals("groups")) this.groups = pair.getValue();
            else if (pair.getKey().equals("phoneHouse")) this.phoneHouse = pair.getValue();
            else if (pair.getKey().equals("mobPhone")) this.mobPhone = pair.getValue();
            else if (pair.getKey().equals("mobPhone2")) this.mobPhone2 = pair.getValue();
            else if (pair.getKey().equals("email")) this.email = pair.getValue();
            else if (pair.getKey().equals("skype")) this.skype = pair.getValue();
            else if (pair.getKey().equals("addressIndex")) this.addressIndex = pair.getValue();
            else if (pair.getKey().equals("addressCity")) this.addressCity = pair.getValue();
            else if (pair.getKey().equals("addressStreet")) this.addressStreet = pair.getValue();
            else if (pair.getKey().equals("addressHouseNumber")) this.addressHouseNumber = pair.getValue();
            else if (pair.getKey().equals("addressApartmentNumber")) this.addressApartmentNumber = pair.getValue();
            else if (pair.getKey().equals("fullAddress")) this.fullAddress = pair.getValue();
            else if (pair.getKey().equals("datesOfEntry")) this.datesOfEntry = pair.getValue();
            else if (pair.getKey().equals("datesLastChange")) this.datesLastChange = pair.getValue();



        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteBook noteBook = (NoteBook) o;

        if (name != null ? !name.equals(noteBook.name) : noteBook.name != null) return false;
        if (secondName != null ? !secondName.equals(noteBook.secondName) : noteBook.secondName != null) return false;
        if (petronymic != null ? !petronymic.equals(noteBook.petronymic) : noteBook.petronymic != null) return false;
        if (shortName != null ? !shortName.equals(noteBook.shortName) : noteBook.shortName != null) return false;
        if (nickName != null ? !nickName.equals(noteBook.nickName) : noteBook.nickName != null) return false;
        if (comment != null ? !comment.equals(noteBook.comment) : noteBook.comment != null) return false;
        if (groups != null ? !groups.equals(noteBook.groups) : noteBook.groups != null) return false;
        if (phoneHouse != null ? !phoneHouse.equals(noteBook.phoneHouse) : noteBook.phoneHouse != null) return false;
        if (mobPhone != null ? !mobPhone.equals(noteBook.mobPhone) : noteBook.mobPhone != null) return false;
        if (mobPhone2 != null ? !mobPhone2.equals(noteBook.mobPhone2) : noteBook.mobPhone2 != null) return false;
        if (email != null ? !email.equals(noteBook.email) : noteBook.email != null) return false;
        if (skype != null ? !skype.equals(noteBook.skype) : noteBook.skype != null) return false;
        if (addressIndex != null ? !addressIndex.equals(noteBook.addressIndex) : noteBook.addressIndex != null)
            return false;
        if (addressCity != null ? !addressCity.equals(noteBook.addressCity) : noteBook.addressCity != null)
            return false;
        if (addressStreet != null ? !addressStreet.equals(noteBook.addressStreet) : noteBook.addressStreet != null)
            return false;
        if (addressHouseNumber != null ? !addressHouseNumber.equals(noteBook.addressHouseNumber) : noteBook.addressHouseNumber != null)
            return false;
        if (addressApartmentNumber != null ? !addressApartmentNumber.equals(noteBook.addressApartmentNumber) : noteBook.addressApartmentNumber != null)
            return false;
        if (fullAddress != null ? !fullAddress.equals(noteBook.fullAddress) : noteBook.fullAddress != null)
            return false;
        if (datesOfEntry != null ? !datesOfEntry.equals(noteBook.datesOfEntry) : noteBook.datesOfEntry != null)
            return false;
        return !(datesLastChange != null ? !datesLastChange.equals(noteBook.datesLastChange) : noteBook.datesLastChange != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (petronymic != null ? petronymic.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        result = 31 * result + (phoneHouse != null ? phoneHouse.hashCode() : 0);
        result = 31 * result + (mobPhone != null ? mobPhone.hashCode() : 0);
        result = 31 * result + (mobPhone2 != null ? mobPhone2.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (skype != null ? skype.hashCode() : 0);
        result = 31 * result + (addressIndex != null ? addressIndex.hashCode() : 0);
        result = 31 * result + (addressCity != null ? addressCity.hashCode() : 0);
        result = 31 * result + (addressStreet != null ? addressStreet.hashCode() : 0);
        result = 31 * result + (addressHouseNumber != null ? addressHouseNumber.hashCode() : 0);
        result = 31 * result + (addressApartmentNumber != null ? addressApartmentNumber.hashCode() : 0);
        result = 31 * result + (fullAddress != null ? fullAddress.hashCode() : 0);
        result = 31 * result + (datesOfEntry != null ? datesOfEntry.hashCode() : 0);
        result = 31 * result + (datesLastChange != null ? datesLastChange.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", petronymic='" + petronymic + '\'' +
                ", shortName='" + shortName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", groups='" + groups + '\'' +
                ", phoneHouse='" + phoneHouse + '\'' +
                ", mobPhone='" + mobPhone + '\'' +
                ", mobPhone2='" + mobPhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", addressIndex='" + addressIndex + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressHouseNumber='" + addressHouseNumber + '\'' +
                ", addressApartmentNumber='" + addressApartmentNumber + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", datesOfEntry='" + datesOfEntry + '\'' +
                ", datesLastChange='" + datesLastChange + '\'' +
                '}';
    }
}
