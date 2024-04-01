package app;

import geometry.Block;
import geometry.Cube;
import geometry.Cylinder;
import geometry.Prism;
import shapes.Circle;
import shapes.Rectrangle;
import shapes.Triangle;

public class App {
  public static void main(String[] args) {

    // Shapes

    Rectrangle square = new Rectrangle(4);
    System.out.println(" Square Area: " + square.getArea());
    System.out.println(" Square Perimeter: " + square.getPerimeter());

    Rectrangle rectrangle = new Rectrangle(2, 3);
    System.out.println(" rectrangle Area: " + rectrangle.getArea());
    System.out.println(" rectrangle Perimeter: " + rectrangle.getPerimeter());

    Triangle isosceles_triangle = new Triangle(4, 2);
    System.out.println(" isosceles_triangle Area: " + isosceles_triangle.getArea());
    System.out.println(" isosceles_triangle Perimeter: " + isosceles_triangle.getPerimeter());

    Triangle equilateral_triangle = new Triangle(3);
    System.out.println(" equilateral_triangle Area: " + equilateral_triangle.getArea());
    System.out.println(" equilateral_triangle Perimeter: " + equilateral_triangle.getPerimeter());

    Triangle triangle = new Triangle(4, 3, 5);
    System.out.println(" triangle Area: " + triangle.getArea());
    System.out.println(" triangle Perimeter: " + triangle.getPerimeter());

    Circle circle = new Circle(3);
    System.out.println(" circle Area: " + circle.getArea());
    System.out.println(" circle Perimeter: " + circle.getPerimeter());

    // geometry

    Cylinder cylinder = new Cylinder(3, 4);
    System.out.println(" cylinder Area: " + cylinder.getBaseArea());
    System.out.println(" cylinder Volume: " + cylinder.getVolume());

    Prism prism = new Prism(3, 5);
    System.out.println(" prism Area: " + prism.getBaseArea());
    System.out.println(" prism Volume: " + prism.getVolume());

    Block block = new Block(5, 2);
    System.out.println(" block Area: " + block.getBaseArea());
    System.out.println(" block Volume: " + block.getVolume());

    Cube cube = new Cube(9);
    System.out.println(" cube Area: " + cube.getBaseArea());
    System.out.println(" cube Volume: " + cube.getVolume());

  }

}