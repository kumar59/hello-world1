import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @BeforeEach
    void setUpStreams() {
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    void testMainPrintsHelloGlobeMaster1() {
        Hello.main(new String[]{});
        String output = outContent.toString().trim();
        assertEquals("Hello, Globe Master1", output);
    }
}