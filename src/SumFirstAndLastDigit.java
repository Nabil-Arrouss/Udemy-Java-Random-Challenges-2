class SumFirstAndLastDigit {
    /**
     * Calculates the sum of the first and last digits of a number.
     * @param number The number
     * @return The sum of the first and last digits
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number + lastDigit;
    }
}