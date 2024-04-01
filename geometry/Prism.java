package geometry;

public class Prism implements Geometry {
  protected double baseArea;
  protected double height;

  public Prism(double baseArea, double height) {
    this.height = height;
    this.baseArea = baseArea;
  }

  @Override
  public double getBaseArea() {

    return new shapes.Rectrangle(baseArea).getArea() * height;
  }

  @Override
  public double getVolume() {
    return baseArea * height;
  }
}
