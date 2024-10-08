package Java.StaticMethodsOverConstructor.solution1;

import Java.StaticMethodsOverConstructor.solution1.shapes.Shape;
import Java.StaticMethodsOverConstructor.solution1.shapes.ShapeFactory;

public class Client {
  public static void main(String[] args) {
    Shape shape = ShapeFactory.getShape("CIRCLE");
    shape.draw();
  }
}
