public class Main {

    public static double math(double value, double number) {

        return ((value * 2) / 3 * number);

    }

    public static String math2(int number2, int numbers3) {
        return ("Summe:" + (number2 + numbers3));

    }


//_____________________________________________//

    public static void main(String[] args) {

        // Method
        double result = math(32, 2);
        System.out.println("Das Ergebnis der Methode ist " + result);


        System.out.println(math2(20, 30));


        if (result > 100) {

            System.out.println("Das Ergebnis ist über 100");
        } else {
            System.out.println("Das Ergebnis ist unter 100");

        }


    }


}
