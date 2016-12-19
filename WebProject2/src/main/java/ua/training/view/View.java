package ua.training.view;

import ua.training.model.entity.Composite;

import java.util.List;

/**
 * Created by Plavun on 05.12.2016.
 */
public class View {


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

    /**
     * print separator
     */
    public void printSeparator(){
        System.out.println("===============================================");
    }

    public void printComposite( Composite composite){
        composite.show();
        System.out.println();
    }

    public void printListComposite( List<Composite> cacheAllTextList2){

        for (Composite composite: cacheAllTextList2){


            composite.show();
            System.out.println();

        }

    }
}
