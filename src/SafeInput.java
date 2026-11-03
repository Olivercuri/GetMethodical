import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if (retString.length() == 0) {
                System.out.println("Input cannot be blank. Try again.");
            }

        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int value;

        while (true) {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value;

        while (true) {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid number: " + trash);
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;

        while (true) {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Number must be between " + low + " and " + high);
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        }
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value;

        while (true) {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Number must be between " + low + " and " + high);
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid number: " + trash);
            }
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        while (true) {
            System.out.print("\n" + prompt + " [Y/N]: ");

            String answer = pipe.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please enter Y or N.");
            }
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        while (true) {
            System.out.print("\n" + prompt + ": ");

            String value = pipe.nextLine();

            if (value.matches(regEx)) {
                return value;
            } else {
                System.out.println("Invalid format. Try again.");
            }
        }
    }

    public static void prettyHeader(String msg) {

        int width = 60;

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }

        System.out.println();

        int available = width - 6;

        if (msg.length() > available) {
            msg = msg.substring(0, available);
        }

        int totalSpaces = available - msg.length();
        int leftSpaces = totalSpaces / 2;
        int rightSpaces = totalSpaces - leftSpaces;

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}