import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String e = "89 111 117 114 32 112 114 111 103 114 97 109 32 115 104 111 117 108 100 32 102 105 114 115 116 32 100 101 99 111 100 101 32 116 104 105 115 32 98 108 111 99 107 32 111 102 32 116 101 120 116 32 97 110 100 32 100 105 115 112 108 97 121 32 105 116 46 32 84 104 101 110 44 32 112 114 111 109 112 116 32 116 104 101 32 117 115 101 114 32 102 111 114 32 97 32 110 97 109 101 46 32 84 97 107 101 32 116 104 97 116 32 110 97 109 101 32 97 110 100 32 111 117 116 112 117 116 32 116 104 101 32 102 111 108 108 111 119 105 110 103 58 32 84 104 101 32 110 97 109 101 32 105 110 32 114 101 118 101 114 115 101 44 32 116 104 101 32 82 101 118 101 114 115 101 32 111 114 100 101 114 32 105 110 32 65 76 76 32 67 65 80 73 84 65 76 83 44 32 116 104 101 32 111 114 105 103 105 110 97 108 32 115 116 114 105 110 103 32 117 115 105 110 103 32 67 97 77 101 76 32 99 65 115 69 44 32 97 110 100 32 102 105 110 97 108 108 121 32 116 104 101 32 111 114 105 103 105 110 97 108 32 115 116 114 105 110 103 32 105 110 32 65 83 67 73 73 46 32 68 79 32 78 79 84 32 85 83 69 32 65 78 89 32 83 84 82 73 78 71 32 77 65 78 73 80 85 76 65 84 73 79 78 32 77 69 84 72 79 68 83 46 13 10";
        String[] codes = e.split(" ");

        // Convert the string codes into their respective character code
        // This should print out:
        // Your program should first decode this block of text and display it. Then, prompt the user for a name.
        // Take that name and output the following: The name in reverse, the Reverse order in ALL CAPITALS,
        // the original string using CaMeL cAsE, and finally the original string in ASCII. DO NOT USE ANY STRING MANIPULATION METHODS
        for (String code : codes) {
            int i = Integer.valueOf(code);
            System.out.print((char) i);
        }

        // Create a scanner and prompt the user for their name
        Scanner scan = new Scanner(System.in);
        System.out.print("Pardon me mate, whats your name? ");
        String name = scan.nextLine();

        // Reverse the inputted name
        String reversedName = "";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversedName += name.charAt(l);
        }

        // Reformat the inputted name to camel case
        String camelCase = "";
        for (int l = 0; l < name.length(); l++) {
            char letter = name.charAt(l);

            // Depending on if the current index of the loop is even, capitalize and/or lowercase the iterated letter
            camelCase += l % 2 == 0 ? upper(letter) : lower(letter);
        }

        // Convert the inputted name to ascii character codes
        String ascii = "";
        for (int l = 0; l < name.length(); l++) {
            char letter = name.charAt(l);
            ascii += String.valueOf((int) letter);

            // Add a space in between each code
            if (l < name.length() - 1) ascii += " ";
        }

        // Print out the transformed strings: reversed, reversed in ALL CAPITALS, CaMeL cAsE, and in ASCII
        System.out.println("Reversed: " + reversedName);
        System.out.println("REVERSED: " + reversedName.toUpperCase());
        System.out.println("CaMeL cAsE: " + camelCase);
        System.out.println("ASCII: " + ascii);
    }

    public static char upper(char letter) {
        int dec = letter; // Convert the character to decimal

        return (dec >= 97 && dec <= 122) // Check if its ascii value is in the lowercase range of characters
                ? (char) (dec - 32) // If true, shift its value to its uppercase counterpart
                : letter; // Otherwise, return the unshifted variable
    }

    public static char lower(char letter) {
        int dec = letter; // Convert the character to decimal

        return (dec >= 65 && dec <= 90) // Check if its ascii value is in the uppercase range of characters
                ? (char) (dec + 32) // If true, shift its value to its lowercase counterpart
                : letter; // Otherwise, return the unshifted variable
    }
}