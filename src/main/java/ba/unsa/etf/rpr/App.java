package ba.unsa.etf.rpr;

public class App
{
    public static void main( String[] args )
    {
        if(args.length==0) {
            System.out.printf("Nije unesen izraz!");

        }else {
            String izraz = "";
            for (String s : args)
                izraz = izraz + s;
            try {
                double rez = ExpressionEvaluator.evaluate(izraz);
                System.out.println("Rezultat: " + rez);
            } catch (RuntimeException poruka) {
                System.out.println(poruka.getMessage());
            }
        }
    }
}
