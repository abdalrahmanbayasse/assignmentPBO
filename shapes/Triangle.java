package shapes;

public class Triangle implements Shape {
  protected double base;
  protected double height;
  protected double hypotenuse;
  protected double area;
  protected double perimiter;

  public Triangle(double base, double height, double hypotenuse) {
    this.base = base;
    this.height = height;
    this.hypotenuse = hypotenuse;

  }

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
    this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
  }

  public Triangle(double base) {
    this.base = base;
    this.height = base;
    this.hypotenuse = base;
  }

  @Override
  public double getArea() {
    area = (height * base) / 2;
    return area;
  }

  @Override
  public double getPerimeter() {
    perimiter = this.base + this.height + this.hypotenuse;
    return perimiter;
  }
}
