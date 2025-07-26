import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void testMainPrintsHelloGlobeMaster1() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Act
        Hello.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Assert
        String output = outContent.toString().trim();
        assertEquals("Hello, Globe Master1", output);
    }
}