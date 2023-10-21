import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to mark the presence of each alphabet from a to z
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input to lowercase to make it case-insensitive
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('a' <= c && c <= 'z') {
                // If the character is a lowercase alphabet, mark it as present
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabets from a to z are marked as present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
