package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionEvaluatorTest {

    @Test
    void sabiranje() {
        String izraz="( 2 + ( 3 + ( ( 4 + 5 ) + 10 ) ) )";
        assertEquals(2 + ( 3 + ( ( 4 + 5 ) + 10 ) ),ExpressionEvaluator.evaluate(izraz));
    }
    @Test
    void oduzimanje() {
        String izraz="( 10 - ( -5 + ( 2 - 1 ) ) )";
        assertEquals(10 - ( -5 + ( 2 - 1 ) ),ExpressionEvaluator.evaluate(izraz));
    }
    @Test
    void mnozenje() {
        String izraz="( 2 * ( ( 3 * ( 6 * 10 ) ) * 5 ) )";
        assertEquals(2 * ( ( 3 * ( 6 * 10 ) ) * 5 ),ExpressionEvaluator.evaluate(izraz));
    }
    @Test
    void dijeljenje() {
        String izraz="( 8 / ( 6 / ( 10 / 5 ) ) )";
        assertEquals( 8 / ( 6 / ( 10. / 5 ) ),ExpressionEvaluator.evaluate(izraz));
    }
    @Test
    void korijen() {
        String izraz="( sqrt ( sqrt ( sqrt 100 ) ) )";
        assertEquals(Math.sqrt(Math.sqrt(Math.sqrt(100))),ExpressionEvaluator.evaluate(izraz));
    }
}