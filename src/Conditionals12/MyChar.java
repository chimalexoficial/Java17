package Conditionals12;

public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {

        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
            // TODO: Complete the switch statement
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u': return true;
        }

        return false;
    }
}
