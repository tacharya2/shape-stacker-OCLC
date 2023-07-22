package shape.stacker.shape;

import shape.stacker.shape.shapes.Shape;

import java.util.*;
import java.util.List;

public class ShapeStacker {
    private List<Shape> shapes;

    public ShapeStacker(){
        shapes = new ArrayList<>();
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public String stack(){
        if(shapes.isEmpty()){
            return "";
        }
        Stack<String> stack = new Stack<>();
        for(Shape shape : shapes){
            stack.push(shape.getAccounted());
        }
        StringBuilder stackedShapes = new StringBuilder(stack.pop());
        while(!stack.isEmpty()){
            stackedShapes = new StringBuilder(stack.pop() + "[" + stackedShapes + "]");
        }
        return stackedShapes.toString();
    }
}
