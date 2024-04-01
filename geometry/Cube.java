package geometry;

public class Cube implements Geometry {
  private double side;

 public  Cube(double side) {
    this.side = side;

  }

  @Override
  public double getVolume() {
    return side * side * side;
  }

  @Override
  public double getBaseArea() {

    return new shapes.Rectrangle(side).getArea();
  }

}
