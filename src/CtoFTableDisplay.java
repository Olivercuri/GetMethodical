public class CtoFTableDisplay {

    public static void main(String[] args) {

        System.out.printf("%10s %15s%n", "Celsius", "Fahrenheit");

        System.out.println("----------------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {

            System.out.printf("%10d %15.2f%n",
                    celsius, CtoF(celsius));

        }

    }

    public static double CtoF(double Celsius) {

        return (Celsius * 9.0 / 5.0) + 32.0;

    }
}