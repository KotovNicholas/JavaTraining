package ua.block04.notes;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Nicholas Kotov on 03.11.2016.
 */
public class View {


    //error
    public static final String ERRORENTER = "Error data entry ";

    public static final String ERRORENTERNAMES = "The data should contain only letters from 3 to 30 characters";
    public static final String ERRORENTERCOMMENT= "The data should contain only letters end numerals from 0 to 250 characters";
    public static final String ERRORENTERGROUP = "The data should contain only letters end numerals from 0 to 30 characters";
    public static final String ERRORENTERPHONE = "The data should contain only numerals and contains 11 characters";
    public static final String ERRORENTEREMAIL = "The data should contain @";
    public static final String ERRORENTERSKYPE = "The data should contain only letters from 6 to 32 characters";
    public static final String ERRORENTERADRESSINDEX = "The data should contain only numerals from 3 to 33 characters\"";
    public static final String ERRORENTERCITY = "The data should contain only letters end numerals from 0 to 250 characters";
    public static final String ERRORENTERNUMBER = "The data should contain only numerals from 1 to 33 characters";

    //text's
    public static final String GREETING = "Greeting, please enter data for a directory note ";
    public static final String FIRSTNAME = "Enter first name";
    public static final String SECONDNAME = "Enter second name";
    public static final String PATRONYMIC = "Enter patronymic";
    public static final String COMMENT = "Enter comment";
    public static final String GROUP = "Enter group";
    public static final String PHONEHOUSE = "Enter phone house";
    public static final String PHONEMOB = "Enter mobile phone";
    public static final String PHONEMOB2 = "Enter mobile phone2";
    public static final String EMAIL = "Enter e-mail";
    public static final String SKYPE = "Enter skype";
    public static final String ADRESSINDEX = "Enter adress index";
    public static final String ADRESSCITY = "Enter city";
    public static final String ADRESSSTREET = "Enter street";
    public static final String ADRESSHOUSENUMBER = "Enter house number";
    public static final String ADRESSAPARTAMENTNUMBER = "Enter apartment number";




    //regular
    public static final String REGULARNAME = "[A-Za-z]{3,30}";
    public static final String REGULARCOMMENT = "[A-Za-z0-9\\s]{0,250}";
    public static final String REGULARGROUP = "[A-Za-z0-9]{0,30}";
    public static final String REGULARPHONE = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    public static final String REGULARPHONE2 = ".{0}|^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    public static final String REGULAREMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    public static final String REGULARSKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";
    public static final String REGULARADRESSINDEX = "[0-9]{3,33}";
    public static final String REGULARCITY = "[A-Za-z0-9]{0,250}";
    public static final String REGULARNUMBER = "[0-9]{1,15}";


    /**
     * enter message
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     *
     * @param message
     */
    public void concatenationAndPrint(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
        //System.out.println(concatString);
    }

}
