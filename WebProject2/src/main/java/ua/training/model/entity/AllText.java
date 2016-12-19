package ua.training.model.entity;

import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public interface AllText {
    void show();
    Type getType();
    List<AllText> getElement();
    List<Composite> getContentType(Type type);

    }
