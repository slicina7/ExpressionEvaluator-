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
        String izraz="( 10 - ( -5 - ( 2 - 1 ) ) )";
        assertEquals(10 - ( -5 - ( 2 - 1 ) ),ExpressionEvaluator.evaluate(izraz));
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
        String izraz="( 1 + sqrt ( 350 ) )";
        assertEquals(1+Math.sqrt(350),ExpressionEvaluator.evaluate(izraz));
    }
    @Test
    void izuzetak1(){
        String izraz="";
        assertThrows(RuntimeException.class, ()->ExpressionEvaluator.evaluate(izraz),"Netacno");
    }
    @Test
    void izuzetak2(){
        String izraz="( 1 + 3 + 2 )";
        assertThrows(RuntimeException.class, ()->ExpressionEvaluator.evaluate(izraz),"Netacno");
    }
    @Test
    void izuzetak3(){
        String izraz="( ( 2 + 3 )";
        assertThrows(RuntimeException.class, ()->ExpressionEvaluator.evaluate(izraz),"Netacno");
    }
    @Test
    void izuzetak4(){
        String izraz="2 + 5";
        assertThrows(RuntimeException.class, ()->ExpressionEvaluator.evaluate(izraz),"Netacno");
    }

}