public class Main {

    public static double Math(double value, double Zahl) {

        return ((value * 2) / 3 * Zahl);

    }

    public static int Aufgabe(int Zahlen2, int Zahlen) {
        return Zahlen2 + Zahlen;

    }


//_____________________________________________//

    public static void main(String[] args) {

        // Method
        double result = Math(32, 2);
        System.out.println("Das Ergebnis der Methode ist " + result);

        int Aufgaben = Aufgabe(80, 22);
        System.out.println("Summe:" + Aufgaben);

        if (Aufgaben > 100) {

            System.out.println("Das Ergebnis ist über 100");
        } else {
            System.out.println("Das Ergebnis ist unter 100");

        }


    }


}
