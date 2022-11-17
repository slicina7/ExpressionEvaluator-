package ba.unsa.etf.rpr;

import java.util.Stack;

public class ExpressionEvaluator {
    public static Double evaluate(String izraz) {
        Double broj1,broj2;
        String znak="";
        Stack<String> operatori=new Stack<>();
        Stack<Double> brojevi=new Stack<>();
        for(String c : izraz.split(" ")){
            if(c.equals("("));
            else if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) operatori.push(c);
            else if(c.equals(")")) {
                broj1 = brojevi.peek();
                brojevi.pop();
                broj2 = brojevi.peek();
                brojevi.pop();
                znak=operatori.peek();
                if(znak.equals("+")) brojevi.push(broj1+broj2);
                else if(znak.equals("-")) brojevi.push(broj1-broj2);
                else if(znak.equals("*")) brojevi.push(broj1*broj2);
                else if(znak.equals("/")) brojevi.push(broj2/broj1);
                operatori.pop();
            }
            brojevi.push(Double.valueOf(c));
        }
        return brojevi.peek();
    }
}
