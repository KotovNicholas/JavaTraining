package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public class Composite implements AllText {
    private List<AllText> components = new ArrayList<>();
    private Type type;
    //private List<Composite> thisComposite = new ArrayList<>();

    public Composite() {
    }

    public Composite(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }



    public void setType(Type type) {
        this.type = type;
    }

    public void addComponent(AllText component){
        components.add(component);

    }

    public void removeComponent(AllText component){
        components.remove(component);
    }

    public List<AllText> getComponents() {
        return components;
    }

    @Override
    public List<Composite> getContentType(Type type) {

        List<Composite> allTextResult2 = new ArrayList<>();
        List<Composite> allTextResult = new ArrayList<>();
        if (this.type==type){
            allTextResult.add(this);
        }

        for (AllText allText: components){
            allTextResult2 = allText.getContentType(type);
            if (!allTextResult2.isEmpty()){
                allTextResult.addAll(allTextResult2);
            }
        }
        return allTextResult;
    }


    public void show() {
        components.forEach(n -> n.show());
    }

    @Override
    public String toString() {
        return "Composite{" +
                "components=" + components +
                ", type=" + type +
                '}';
    }

    @Override
    public List<AllText> getElement() {

        List<AllText> allTextResult = new ArrayList<>();


        for (AllText allText:components){
            allTextResult.addAll(allText.getElement());
        }

        return allTextResult;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Composite composite = (Composite) o;

        if (!components.equals(composite.components)) return false;
        return type == composite.type;

    }

    @Override
    public int hashCode() {
        int result = components.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
