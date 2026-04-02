package greeter;

import greeter.Greeter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new DefaultGreeter();
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new FormalGreeter();
        //greeter.setFormality("formal");
        assertEquals("Good evening, sir.", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new CasualGreeter();
        //greeter.setFormality("casual");
        assertEquals("Sup bro?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new IntimateGreeter();
        //greeter.setFormality("intimate");
        assertEquals("Hello Darling!", greeter.greet());
    }
}
