import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Tests para suma
    @Test
    void suma() {
        assertEquals(3, Calculadora.suma(1, 2));
        assertEquals(0, Calculadora.suma(-1, 1));
        assertEquals(-5, Calculadora.suma(-2, -3));
        assertEquals(10, Calculadora.suma(0, 10));
    }

    // Tests para resta
    @Test
    void resta() {
        assertEquals(-1, Calculadora.resta(1, 2));
        assertEquals(2, Calculadora.resta(5, 3));
        assertEquals(-10, Calculadora.resta(-5, 5));
        assertEquals(0, Calculadora.resta(0, 0));
    }

    // Tests para multiplicación
    @Test
    void mult() {
        assertEquals(28.09f, Calculadora.mult(5.3f, 5.3f), 0.0001f);
        assertEquals(0f, Calculadora.mult(0f, 5.3f), 0.0001f);
        assertEquals(-15.0f, Calculadora.mult(-3f, 5f), 0.0001f);
        assertEquals(6.25f, Calculadora.mult(-2.5f, -2.5f), 0.0001f);
    }

    // Tests para división
    @Test
    void div() {
        assertEquals(1f, Calculadora.div(5.3f, 5.3f), 0.0001f);
        assertEquals(2f, Calculadora.div(10f, 5f), 0.0001f);
        assertEquals(-2f, Calculadora.div(-10f, 5f), 0.0001f);
        assertEquals(0f, Calculadora.div(0f, 5f), 0.0001f);
    }
}
