
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraMockitoTest {
    public static Calculadora calc;

    @BeforeAll
    static void setUp() {
        //calc = new Calculadora();
        calc = Mockito.mock(Calculadora.class);
        Mockito.when(calc.resta(2,1)).thenReturn(1);
        Mockito.when(calc.suma(2,1)).thenReturn(3);
        Mockito.when(calc.suma(-1,-2)).thenReturn(-3);
        Mockito.when(calc.suma(Integer.MIN_VALUE,Integer.MIN_VALUE)).thenThrow(new ArithmeticException());
        Mockito.when(calc.suma(Integer.MAX_VALUE,Integer.MAX_VALUE)).thenThrow(new ArithmeticException());
    }

    @Test
    void resta() {
        //assertEquals(1, calc.resta(2, 1));
        assertThat(calc.resta(2,1),is(1));
    }

    @Nested // Aquesta annotation serveix per a enllaçar tests sota un mateix nom
    @DisplayName("Tests del mètode suma")
    class sumaTests {

        @Test
        void sumaPositius() {
            assertEquals(3, calc.suma(2, 1));
        }

        @Test
        void sumaNegatius() {
            assertEquals(-3, calc.suma(-1, -2));
        }

        @Test
        void sumaEdgeCaseNegatius() {
            assertThrows(ArithmeticException.class, () -> {
                calc.suma(Integer.MIN_VALUE, Integer.MIN_VALUE);
            });
        }

        @Test
        void sumaEdgeCasePositius() {
            assertThrows(ArithmeticException.class, () -> {
                calc.suma(Integer.MAX_VALUE, Integer.MAX_VALUE);
            });
        }
    }
}