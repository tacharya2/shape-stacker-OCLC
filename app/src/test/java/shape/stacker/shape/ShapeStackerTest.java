package shape.stacker.shape;

import org.junit.jupiter.api.Test;
import shape.stacker.shape.shapes.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShapeStackerTest {

    @Test
     public void testStackWithNoShapes() {
        ShapeStacker shapeStacker = new ShapeStacker();
        String result = shapeStacker.stack();
        assertEquals("", result);
    }

    @Test
    public void testStackWithMultipleShapes() {
        Shape mockShape1 = mock(Shape.class);
        Shape mockShape2 = mock(Shape.class);
        Shape mockShape3 = mock(Shape.class);

        when(mockShape1.getAccounted()).thenReturn("Shape1");
        when(mockShape2.getAccounted()).thenReturn("Shape2");
        when(mockShape3.getAccounted()).thenReturn("Shape3");

        ShapeStacker shapeStacker = new ShapeStacker();
        shapeStacker.addShape(mockShape1);
        shapeStacker.addShape(mockShape2);
        shapeStacker.addShape(mockShape3);

        String result = shapeStacker.stack();
        assertEquals("Shape1[Shape2[Shape3]]", result);

    }
    @Test
    public void testStackWithSquareCircleTriangle(){
        ShapeStacker shapeStacker = new ShapeStacker();

        shapeStacker.addShape(new Circle(4));
        shapeStacker.addShape(new Triangle(4, 10, 10));
        shapeStacker.addShape(new Square(4));

        String result = shapeStacker.stack();
        assertEquals("T[S[C]]", result);
    }
   @Test
    public void testStackWithSquareCircleRectangle(){
        ShapeStacker shapeStacker = new ShapeStacker();
        shapeStacker.addShape(new Square(4));
        shapeStacker.addShape(new Circle(6));
        shapeStacker.addShape(new Rectangle(2, 4));

        String result = shapeStacker.stack();
        assertEquals("C[S[R]]", result);
   }
  @Test
  public void testWithTriangleRectangleSquare(){
      ShapeStacker shapeStacker = new ShapeStacker();
      shapeStacker.addShape(new Triangle(4, 10, 10));
      shapeStacker.addShape(new Rectangle(2, 4));
      shapeStacker.addShape(new Square(4));

      String result = shapeStacker.stack();
      assertEquals("T[S[R]]", result);
  }
    @Test
    public void testStackWithTriangleCircle() {
        ShapeStacker shapeStacker = new ShapeStacker();
        shapeStacker.addShape(new Circle(20));
        shapeStacker.addShape(new Triangle(4, 10, 20));

        String result = shapeStacker.stack();
        assertEquals("T[C]", result);
    }
    @Test
    public void testStackWithSquareRectangle() {
        ShapeStacker shapeStacker = new ShapeStacker();
        shapeStacker.addShape(new Rectangle(4, 4));
        shapeStacker.addShape(new Square(4));

        String result = shapeStacker.stack();
        //determined by the stacking order
        assertEquals("R[S]", result);
    }
}