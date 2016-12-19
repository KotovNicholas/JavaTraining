package ua.training.model;

import ua.training.model.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Task4 {

    public Task4() {
    }

    public List<Composite> getNumberQuestionSentence(Composite compositeMain, Integer findCountSymbol){

        List<AllText> cacheAllTextList = new ArrayList<>();
        List<Composite> cacheAllTextList2 = new ArrayList<>();
        List<AllText> cacheAllTextList3 = new ArrayList<>();

        FlyweightFactory flyweightFactory2 = new FlyweightFactory();

        for (Composite i : compositeMain.getContentType(Type.SENTENCE)) {


            cacheAllTextList = i.getElement();

            if (cacheAllTextList.get(i.getElement().size() - 1) == PunctuationMark.QUESTION_MARK) {
                for (Composite j : i.getContentType(Type.WORD)) {

                    cacheAllTextList3 = j.getElement();

                    if (cacheAllTextList3.size()==findCountSymbol){

                        if (!cacheAllTextList2.contains(j)) {
                            cacheAllTextList2.add(j);

                        }

                    }

                }
            }
        }

//        //Task 4
//        for (Composite composite: cacheAllTextList2){
//
//
//            composite.show();
//            System.out.println();
//            //System.out.println(composite.toString());
//        }

        return cacheAllTextList2;

    }
}
