public class Main {

    public static double Math(double value, double Zahl) {

        return ((value * 2) / 3 * Zahl);

    }

    public static String Math2(int Zahlen2, int Zahlen) {
        return ("Summe:"+(Zahlen2 + Zahlen));

    }


//_____________________________________________//

    public static void main(String[] args) {

        // Method
        double result = Math(32, 2);
        System.out.println("Das Ergebnis der Methode ist " + result);


        System.out.println(Math2(20,30));


        if ( result> 100) {

            System.out.println("Das Ergebnis ist über 100");
        } else {
            System.out.println("Das Ergebnis ist unter 100");

        }


    }


}
