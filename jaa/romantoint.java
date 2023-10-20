import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity
        scanner.close();

        int result = romanToInteger(roman);

        if (result == -1) {
            System.out.println("Invalid Roman numeral entered.");
        } else {
            System.out.println("The integer equivalent of " + roman + " is: " + result);
        }
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanCharToInt(nextChar);

                if (currentValue < nextValue) {
                    // If the current value is less than the next value, subtract it
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                // Last character, add its value
                result += currentValue;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1; // Invalid character
        }
    }
}
