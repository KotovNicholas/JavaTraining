package ua.training.controler;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class ReaderFile {

    public ReaderFile() {
    }

    public List<Character> readFile(){

        List<Character> line = new ArrayList<>();

        try(FileReader reader = new FileReader(String.valueOf(Properties.ADRESS.getValue())))
        {

            int c;
            while((c=reader.read())!=-1){

                line.add((char)c);


            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return line;
    }

}
