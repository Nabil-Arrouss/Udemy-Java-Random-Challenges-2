public class Palindrome {
    /**
     * Checks if a number is a palindrome.
     * @param number The number to check
     * @return True if the number is a palindrome, otherwise false
     */
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number; // Save the original number for comparison later

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse == originalNumber;
    }
}
