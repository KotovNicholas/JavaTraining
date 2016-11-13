package ua;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Kotov Nicholas on 13.11.2016.
 */
public class ReflectionRunner {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {


        NoteBook note = new NoteBook("7403100", "11.07.2016", "Nicholas");
        System.out.println("Days before birthday: " + note.countDaysBeforeBday());

        System.out.println("Notes: " + note.toString());

        System.out.println("-------------------------------------");

        Class reflectionClass = note.getClass();
        System.out.println("Class name: " + reflectionClass.getName());

        int reflectionClassModifiers = reflectionClass.getModifiers();
        System.out.print("Modifier class : ");

        if (Modifier.isPublic(reflectionClassModifiers)) System.out.println("public");
        if (Modifier.isAbstract(reflectionClassModifiers)) System.out.println("abstract");
        if (Modifier.isFinal(reflectionClassModifiers)) System.out.println("final");


        Constructor[] constructors = reflectionClass.getConstructors();
        System.out.println("Constructor parametrs: ");
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
        }


        Class clazz = Class.forName("ua.NoteBook");

        System.out.println("Methods:");
        for(Method m : clazz.getMethods()) {
            System.out.println( m.getName() );
        }


    }
}
