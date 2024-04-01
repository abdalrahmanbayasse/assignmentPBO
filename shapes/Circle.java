package shapes;

public class Circle implements Shape {
  protected double r;
  protected double pi = Math.PI;

  public Circle(double r) {
    this.r = r;

  }

  @Override
  public double getArea() {
    double area = pi * (r * r);
    return area;
  }

  @Override
  public double getPerimeter() {
    double perimeter = 2 * pi * r;
    return perimeter;
  }

}
