package Java.StaticMethodsOverConstructor.solution1.shapes;

public class ShapeFactory {
  public static Shape getShape(String type) {
    switch(type) {
      case "CIRCLE":
        return new Circle();
      case "SQUARE":
        return new Square();
      default:
        throw new IllegalArgumentException("Invalid shape type");
    }
  }
}
