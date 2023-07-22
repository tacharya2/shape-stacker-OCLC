package shape.stacker.shape.shapes;

public class Circle implements Shape{

    private double diameter;
    public Circle(double diameter){
        this.diameter = diameter;
    }
    @Override
    public String getAccounted() {
        return "C";
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI * Math.pow(diameter/2, 2);
    }
}
