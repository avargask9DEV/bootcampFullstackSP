package challenge1;

import java.util.concurrent.ThreadLocalRandom; // library for Generating random values
import java.util.Scanner;// library to get data by keyboard
import java.util.ArrayList; // import the ArrayList class
import java.util.List; //import the List class
import java.util.Objects; //import the Objects class

public class Challenge1 {
    public static void main(String[] args) {
        // Execution method 1
        int lengthStr = 8;
        String input;
        Scanner sc = new Scanner(System.in);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter A or B to get random string: ");
        input = sc.nextLine().toLowerCase();
        String myStringRandom = randomString(lengthStr, input);
        System.out.printf("The random String  of %d characters for option %s is: %s\n", lengthStr + 2, input.toUpperCase(), myStringRandom);

        // Execution method 2
        System.out.println("Enter the size of the list to enter here: ");
        int lengthList = entry.nextInt();
        List<String> list = new ArrayList<>(); // declare the list of type ArrayList
        // enter the size of the list by data entered by keyboard
        int cont = 1;
        while (cont <= lengthList) {
            System.out.printf("Enter string type values here  %d: ", cont);
            list.add(sc.nextLine().toLowerCase());
            cont++;
        }

        System.out.println("Enter the value of type string to Check from the list: ");
        String valueInput = sc.nextLine().toLowerCase();

        String checkout = String.valueOf(checkingString(valueInput, list));
        System.out.println(checkout);

    }
    // method to get random numbers
    public static int randomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // method to get random numbers
    public static String randomString(int length, String typeString) {
        String charA = "a";
        String charB = "b";
        String typeA = "54";
        String typeB = "08";
        String character = "0123456789";
        String string = "";

        for (int i = 0; i < length; i ++){
            int indexRandom = randomNumber(0, character.length() - 1);
            char charRandom = character.charAt(indexRandom);
            string += charRandom;
        }
        if (typeString.equals(charA)) {
            return typeA + string;
        } else if (typeString.equals(charB)) {

            return typeB + string;
        }
        else {
            return "Option Invalid";
        }

    }
    // Method that performs the check of the value in the list
    public static boolean checkingString(String valueInput, List<String> list) {
        for (String values : list) {
            if (Objects.equals(values, valueInput)) {
                return false;
            }
        }
        return true;
    }
}
