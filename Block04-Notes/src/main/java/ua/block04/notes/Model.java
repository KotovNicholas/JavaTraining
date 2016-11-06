package ua.block04.notes;


import java.util.ArrayList;
import java.util.LinkedHashMap;


/**
 * Created by Nicholas Kotov on 06.11.2016.
 */
public class Model {

    /**
     *
     */
    NoteBook book;

    /**
     * Notes
     */
    LinkedHashMap<String, String > notes;

    public void addNote (LinkedHashMap<String, String >  note){

        this.book = new NoteBook();
        book.setParameters(note);
    }

    public String getToStringNoteBook(){

        return this.book.toString();
    }

}
