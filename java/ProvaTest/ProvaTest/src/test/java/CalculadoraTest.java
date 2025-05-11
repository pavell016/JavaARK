import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    /**
     * Test unitari per a testejar el mètode Calculadora.suma()
     */
    @Test
    void suma() {
        assertEquals(3, Calculadora.suma(1,2));
    }

    /**
     * Test unitari per a testejar el mètode Calculadora.resta()
     */
    @Test
    void resta() {
        assertEquals(-1, Calculadora.resta(1,2));
    }

    /**
     * Test unitari per a testejar el mètode Calculadora.mult()
     */
    @Test
    void mult() {
        assertEquals(28.09f, Calculadora.mult(5.3f,5.3f),0.0001f);
    }
    @Test
    void div() {
        assertEquals(1f, Calculadora.div(5.3f,5.3f),0.0001f);
    }
}