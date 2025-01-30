package Entornos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


class CalculadoraPGBTest {

    private Calculadora calc;

    @BeforeEach
    public void inicioPruebas() {
        calc = new Calculadora(30, 10);
    }

    @AfterEach
    public void finPruebas() {
        calc=null;
    }


    @org.junit.jupiter.api.Test
    public void suma() {
        //Calculadora calc = new Calculadora(3, 5);
        int valorEsperado = 40;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado,valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    public void resta() {
        //Calculadora calc = new Calculadora(5,3);
        int valorEsperado = 20;
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    public void multiplica() {
        //Calculadora calc = new Calculadora(5,3);
        int valorEsperado = 300;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    public void divide() {
        //Calculadora calc = new Calculadora(10,2);
        int valorEsperado = 3;
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    public void testDivideException() {
        Calculadora calc = new Calculadora(30, 0);
        String valorEsperado = "División por 0";
        String valorDevuelto = "";
        try{
            calc.divide();
        }catch (ArithmeticException e) {
            valorDevuelto = e.getMessage();
        }
        assertEquals(valorEsperado, valorDevuelto);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testSumaConValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5);
        int valorEsperado = num + 5;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "4, 5, 9",
            "0, 0, 0"
    })
    public void testSumarConCvsSource(int a, int b, int valorEsperado) {
        Calculadora calc = new Calculadora(a, b);
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

}