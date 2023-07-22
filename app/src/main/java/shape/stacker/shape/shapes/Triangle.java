package shape.stacker.shape.shapes;

public class Triangle implements Shape{
    private double face1;
    private double face2;
    private double face3;

    public Triangle(double face1, double face2, double face3){
        this.face1 = face1;
        this.face2 = face2;
        this.face3 = face3;
    }
    @Override
    public String getAccounted() {
        return "T";
    }
}
