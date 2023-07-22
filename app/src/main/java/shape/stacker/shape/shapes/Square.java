package shape.stacker.shape.shapes;

public class Square implements Shape{
    private double side;

    public Square(double side){
        this.side =  side;
    }
    @Override
    public String getAccounted() {
        return "S";
    }
}
