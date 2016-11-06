package ua.block04.notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Nicholas Kotov on 06.11.2016.
 */
public class Controller {
    Model model;
    View  view;
    LinkedHashMap<String, String > note;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){


        view.printMessage(view.GREETING);

        note = getDates();

        model.addNote(note);


        view.printMessage("----------------------");
        view.printMessage(model.getToStringNoteBook());


    }

    /**
     * get notes for notebook
     * @return
     */
    public LinkedHashMap <String, String > getDates(){

        LinkedHashMap <String, String> cacheData = new LinkedHashMap<String, String>();


        cacheData.put("name", getAnswerAndPrint(cacheData, view.FIRSTNAME, view.REGULARNAME, view.ERRORENTERNAMES));
        cacheData.put("secondName", getAnswerAndPrint(cacheData, view.SECONDNAME, view.REGULARNAME, view.ERRORENTERNAMES));
        cacheData.put("petronymic", getAnswerAndPrint(cacheData, view.PATRONYMIC, view.REGULARNAME, view.ERRORENTERNAMES));
        cacheData.put("shortName", cacheData.get("secondName") + " " + cacheData.get("name").toUpperCase().substring(0, 1) + ".");
        cacheData.put("comment", getAnswerAndPrint(cacheData, view.COMMENT, view.REGULARCOMMENT, view.ERRORENTERCOMMENT));
        cacheData.put("group", getAnswerAndPrint(cacheData, view.GROUP, view.REGULARGROUP, view.ERRORENTERGROUP));
        cacheData.put("phoneHouse", getAnswerAndPrint(cacheData, view.PHONEHOUSE, view.REGULARPHONE, view.ERRORENTERPHONE));
        cacheData.put("mobPhone", getAnswerAndPrint(cacheData, view.PHONEMOB, view.REGULARPHONE, view.ERRORENTERPHONE));
        cacheData.put("mobPhone2", getAnswerAndPrint(cacheData, view.PHONEMOB2, view.REGULARPHONE2, view.ERRORENTERPHONE));
        cacheData.put("email", getAnswerAndPrint(cacheData, view.EMAIL, view.REGULAREMAIL, view.ERRORENTEREMAIL));
        cacheData.put("skype", getAnswerAndPrint(cacheData, view.SKYPE, view.REGULARSKYPE, view.ERRORENTERSKYPE));
        cacheData.put("addressIndex", getAnswerAndPrint(cacheData, view.ADRESSINDEX, view.REGULARADRESSINDEX, view.ERRORENTERADRESSINDEX));
        cacheData.put("addressCity", getAnswerAndPrint(cacheData, view.ADRESSCITY, view.REGULARCITY, view.ERRORENTERCITY));
        cacheData.put("addressStreet", getAnswerAndPrint(cacheData, view.ADRESSSTREET, view.REGULARCITY, view.ERRORENTERCITY));
        cacheData.put("addressHouseNumber", getAnswerAndPrint(cacheData, view.ADRESSHOUSENUMBER, view.REGULARNUMBER, view.ERRORENTERNUMBER));
        cacheData.put("addressApartmentNumber", getAnswerAndPrint(cacheData, view.ADRESSAPARTAMENTNUMBER, view.REGULARNUMBER, view.ERRORENTERNUMBER));
        cacheData.put("fullAddress", cacheData.get("addressIndex") + " " + cacheData.get("addressCity") + " " + cacheData.get("addressStreet") + " " + cacheData.get("addressHouseNumber") + " " + cacheData.get("addressApartmentNumber"));

        Date d = new Date();
        String currentDate = new SimpleDateFormat("dd.MM.yyyy hh:mm").format(d);
        cacheData.put("datesOfEntry", currentDate);
        cacheData.put("datesLastChange", currentDate);


        printNote(cacheData);

        return cacheData;
    }

    /**
     *
     * @param cacheData
     * @param enterText
     * @param regular
     * @param errorMessage
     * @return
     */
    public String getAnswerAndPrint (LinkedHashMap <String, String > cacheData, String enterText, String regular, String errorMessage){

        printNote(cacheData);
        return getAnswer(enterText, regular, errorMessage);
    }

    /**
     *
     * @param cacheData
     */
    public void printNote(LinkedHashMap <String, String > cacheData){
        Integer i = 1;

        view.printMessage("----------------------");
        Iterator<Map.Entry<String, String>> it = cacheData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();

            view.concatenationAndPrint(""+i ,". ", pair.getKey(), " = ", pair.getValue());

            i++;
        }
        view.printMessage("----------------------");


    }

    /**
     *
     * @param enterText
     * @param regular
     * @param errorMessage
     * @return
     */
    public String getAnswer (String enterText, String regular, String errorMessage){

        String userAnswer = "";
        Boolean firstEnter = true;

        do {

            if (!firstEnter){
                view.printMessage(view.ERRORENTER);
                view.printMessage(errorMessage);
            }

            view.concatenationAndPrint(enterText, " -> ");
            try {
                userAnswer = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            firstEnter = false;
        } while (!userAnswer.matches(regular));


        return userAnswer;

    }


}
