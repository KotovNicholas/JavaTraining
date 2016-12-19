package ua.training.controler;

import ua.training.controler.readerFile.ReaderFile;
import ua.training.model.Model;
import ua.training.model.Task4;
import ua.training.model.entity.Composite;
import ua.training.view.View;

import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Controller {
    Model model;
    View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        List<Character> text = new ReaderFile().readFile();

        Composite compositeMain;
        Task4 task4Class = new Task4();
        List<Composite> task4;

        compositeMain = model.ParceText(text);

        task4 = task4Class.getNumberQuestionSentence(compositeMain, 3);

        view.printComposite(compositeMain);
        view.printSeparator();
        view.printListComposite(task4);




        //compositeMain.show();
    }
}
