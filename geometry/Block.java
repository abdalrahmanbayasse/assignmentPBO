package geometry;

public class Block extends Prism {

  public Block(double baseArea, double height) {
    super(baseArea, height);
  }

  @Override
  public double getVolume() {
    return super.getBaseArea() * height;
  }
}
