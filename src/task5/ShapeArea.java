package task5;

public class ShapeArea implements Area {
    final double pi=3.14;
    @Override
    public double Area(double radius) {
        return (pi *radius *radius );
    }

    @Override
    public double Area(double length, double width) {
        return length * width;
    }
}
