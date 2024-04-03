class CanPack {
    /**
     * Checks if it's possible to pack certain weight using given number of big and small bags.
     * @param bigCount The number of big bags
     * @param smallCount The number of small bags
     * @param goal The desired weight to achieve
     * @return True if goal weight can be achieved, otherwise false
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigWeight = bigCount * 5;
        if (bigWeight > goal) {
            bigWeight = goal / 5 * 5;
        }

        return bigWeight + smallCount >= goal;
    }
}