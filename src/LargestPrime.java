class LargestPrime {
    /**
     * Finds the largest prime factor of a number.
     * @param number The number
     * @return The largest prime factor of the given number
     */
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                largestPrime = i;
                while (number % i == 0) {
                    number /= i;
                }
            }
        }

        return largestPrime;
    }
}