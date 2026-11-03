import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in,
                "Enter SSN (123-45-6789)",
                "^\\d{3}-\\d{2}-\\d{4}$");


        String mNumber = SafeInput.getRegExString(in,
                "Enter UC M number (M12345)",
                "^(M|m)\\d{5}$");


        String choice = SafeInput.getRegExString(in,
                "Choose Open, Save, View, or Quit (O/S/V/Q)",
                "^[OoSsVvQq]$");


        System.out.println("Accepted SSN format: " + ssn);

        System.out.println("Accepted M number: " + mNumber);

        System.out.println("Accepted menu choice: " + choice);

    }
}