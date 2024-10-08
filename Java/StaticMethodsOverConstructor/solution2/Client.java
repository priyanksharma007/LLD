package Java.StaticMethodsOverConstructor.solution2;

import Java.StaticMethodsOverConstructor.solution2.shapes.Shape;

public class Client {
  public static void main(String[] args) {
    Shape shape = Shape.getShape("SQUARE");
    shape.draw();
  }
}
