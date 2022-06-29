public class Main {

    public static double Math(double value,double Zahl) {

        return ((value * 2)/3*Zahl);

    }

    public static  String Aufgabe(String Satz, Integer Zahlen)
    {
        return Satz + Zahlen;

    }



//_____________________________________________//

    public static void main(String[] args) {

        // Method
        double result = Math(32,2);
        System.out.println("Das Ergebnis der Methode ist " + result);

        String Aufgaben=Aufgabe("Summe:",27);
        System.out.println(Aufgaben);




    }


}
