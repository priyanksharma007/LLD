package Java.StaticMethodsOverConstructor.solution2.shapes;

public interface Shape {
  void draw();

  static Shape getShape(String type) {
    return switch (type) {
      case "CIRCLE" -> new Circle();
      case "SQUARE" -> new Square();
      default -> throw new IllegalArgumentException("Invalid shape type");
    };
  }
}
