package ba.unsa.etf.rpr;

public class App 
{
    public static void main( String[] args )
    {
        String izraz="";
        for(String s: args)
            izraz= izraz + s + " ";
        double rez=ExpressionEvaluator.evaluate(izraz);
        System.out.println("Rezultat: "+ rez);
    }
}
