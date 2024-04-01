package geometry;

public class Cylinder implements Geometry {

  private double radius;
  private double height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  @Override
  public double getBaseArea() {
    return new shapes.Circle(radius).getArea();

  }

  @Override
  public double getVolume() {
    return new shapes.Circle(radius).getArea() * height;

  }
}
