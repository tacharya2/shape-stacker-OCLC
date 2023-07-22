package shape.stacker;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testAppOutPut(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(new String[]{});

        String output = outputStream.toString().trim();
        String expected = "T[S[C]]";

        assertEquals(expected, output);
    }
}