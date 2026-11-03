import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("TEST A: getNonZeroLenString");

        String text = SafeInput.getNonZeroLenString(in, "Enter some text");

        System.out.println("You entered: " + text);


        System.out.println("\nTEST B: getInt");

        int whole = SafeInput.getInt(in, "Enter any integer");

        System.out.println("Integer: " + whole);


        System.out.println("\nTEST C: getDouble");

        double decimal = SafeInput.getDouble(in, "Enter any decimal number");

        System.out.println("Double: " + decimal);


        System.out.println("\nTEST D: getRangedInt");

        int rangedWhole = SafeInput.getRangedInt(in, "Enter an integer", 1, 10);

        System.out.println("Ranged integer: " + rangedWhole);


        System.out.println("\nTEST E: getRangedDouble");

        double rangedDecimal = SafeInput.getRangedDouble(in, "Enter a decimal", 0.5, 10.0);

        System.out.println("Ranged double: " + rangedDecimal);


        System.out.println("\nTEST F: getYNConfirm");

        boolean yes = SafeInput.getYNConfirm(in, "Would you like to continue?");

        System.out.println("Returned boolean: " + yes);


        System.out.println("\nTEST G: getRegExString");

        String code = SafeInput.getRegExString(in,
                "Enter a UC M number (example M12345)",
                "^(M|m)\\d{5}$");

        System.out.println("Accepted value: " + code);


        System.out.println("\nTEST H: prettyHeader");

        SafeInput.prettyHeader("SafeInput Test Complete");

    }
}