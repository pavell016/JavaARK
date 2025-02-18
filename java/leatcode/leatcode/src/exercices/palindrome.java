package exercices;

public class palindrome {

    public static void main(String[] args) {
        int number = 12351; // Example number to check
        if (number < 0) {
            System.out.println(false); // Negative numbers cannot be palindromes
        } else {
            int originalNumber = number; // Save the original number
            int reversedNumber = 0;

            // Reverse the number
            while (number > 0) {
                int digit = number % 10; // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
                number = number / 10; // Remove the last digit
            }

            // Compare the original number with the reversed number
            if (originalNumber == reversedNumber) {
                System.out.println(true); // It is a palindrome
            } else {
                System.out.println(false); // It is not a palindrome
            }
        }
    }
}