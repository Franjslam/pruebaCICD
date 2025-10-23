import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGetMessage() {
        // Verifica que el mensaje devuelto sea el correcto
        assertEquals("¡Mi proyecto CI/CD funciona!", App.getMessage());
    }
}