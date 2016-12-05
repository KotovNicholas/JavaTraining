package ua.designPattern.flyweight;

import sun.security.provider.SHA;

import java.util.*;

public class FlyweightApp {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));

        Random rand  = new Random();
        shapes.forEach((n) -> n.draw(rand.nextInt(100), rand.nextInt(100)));

    }

}

//Flyweight
interface Shape{
    void draw(int x, int y);
}

class Point implements Shape{

    public void draw(int x, int y) {
        System.out.println("("+x+", "+y+"): draw a point");
    }
}

class Circle implements Shape{

    public void draw(int x, int y) {
        int r = 5;
        System.out.println("("+x+", "+y+"): draw a circle of radius "+r);
    }
}

class Square implements Shape{

    public void draw(int x, int y) {
        int a = 10;
        System.out.println("("+x+", "+y+"): draw a square of side "+a);
    }
}

class ShapeFactory{
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName){

        Shape shape = shapes.get(shapeName);
        if (shape==null){
            switch (shapeName){
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;




    }
}





