package shapes;

public class Rectrangle implements Shape {
  protected double width;
  protected double length;

  public Rectrangle(double side) {
    this.width = this.length = side;
  }

  public Rectrangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + length);
  }

  @Override
  public double getArea() {
    return (width * length);
  }

}
