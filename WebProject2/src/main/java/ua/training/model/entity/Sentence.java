package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */

//Composite
public class Sentence  implements Components {
    private List<Components> components = new ArrayList<>();

    private Type type = Type.SENTENCE;

    public Sentence() {
    }

    public Sentence(List<Components> components) {
        this.components = components;
    }

    public List<Components> getComponents() {
        return components;
    }

    public void setComponents(List<Components> components) {
        this.components = components;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        if (!components.equals(sentence.components)) return false;
        return type == sentence.type;

    }

    @Override
    public int hashCode() {
        int result = components.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "components=" + components +
                '}';
    }

    /**
     * add component
     * @param component
     */
    public void addComponent(Components component){
        components.add(component);
    }

    /**
     * remove component
     * @param component
     */
    public void removeComponent(Components component){
        components.remove(component);
    }


    @Override
    public void PrintText() {
        components.forEach(n->n.PrintText());
    }
}
