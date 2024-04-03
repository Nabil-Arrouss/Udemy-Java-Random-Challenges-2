public class Main {
    public static void main(String[] args) {
        // Test cases for Palindrome class
        System.out.println("Is 12321 a palindrome? " + Palindrome.isPalindrome(12321));
        System.out.println("Is 12345 a palindrome? " + Palindrome.isPalindrome(12345));
        System.out.println("Is 1001 a palindrome? " + Palindrome.isPalindrome(1001));

        // Test cases for SumFirstAndLastDigit class
        System.out.println("Sum of first and last digit of 999 is: " + SumFirstAndLastDigit.sumFirstAndLastDigit(999));
        System.out.println("Sum of first and last digit of 1234 is: " + SumFirstAndLastDigit.sumFirstAndLastDigit(1234));

        // Test cases for EvenNumbers class
        System.out.println("Sum of even numbers in range of 0 - 10 is: " + EvenNumbers.sumOfEvenNumbers(10));
        System.out.println("Sum of even numbers in range of 0 - 20 is: " + EvenNumbers.sumOfEvenNumbers(20));

        // Test cases for CanPack class
        System.out.println("Can we pack 3 big bags, 6 small bags, and reach a goal of 20? " + CanPack.canPack(3, 6, 20));
        System.out.println("Can we pack 5 big bags, 2 small bags, and reach a goal of 15? " + CanPack.canPack(5, 2, 15));

        // Test cases for LargestPrime class
        System.out.println("The largest prime factor of 21 is: " + LargestPrime.getLargestPrime(21));
        System.out.println("The largest prime factor of 100 is: " + LargestPrime.getLargestPrime(100));
        System.out.println("The largest prime factor of 997 is: " + LargestPrime.getLargestPrime(997));
        System.out.println("The largest prime factor of 2 is: " + LargestPrime.getLargestPrime(2));
        System.out.println("The largest prime factor of 4 is: " + LargestPrime.getLargestPrime(4));
        System.out.println("The largest prime factor of 101 is: " + LargestPrime.getLargestPrime(101));
        System.out.println("The largest prime factor of 1000 is: " + LargestPrime.getLargestPrime(1000));
    }
}