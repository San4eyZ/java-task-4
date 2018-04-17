package calculator.datatypes.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexValueTest {

    @Test
    public void lol() {
        ComplexValue value = new ComplexValue(-5.28, 3.4);

        assertEquals("-5.28+3.4i", value.toString());
    }
}