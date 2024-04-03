class EvenNumbers {
    /**
     * Calculates the sum of all even numbers in the range from 0 to a given number.
     * @param number The given number
     * @return The sum of even numbers
     */
    public static int sumOfEvenNumbers(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
