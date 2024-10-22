public class MaxDigitSum {
    private int maxSumNumber = 0;
    private int maxSum = 0;

    public void processNumber(int number) {
        int currentSum = sumOfDigits(number);
        if (currentSum > maxSum) {
            maxSum = currentSum;
            maxSumNumber = number;
        }
    }

    public int getMaxSumNumber() {
        return maxSumNumber;
    }
    public boolean hasMaxSumNumber() {
        return maxSumNumber != 0;
    }

    private int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += Math.abs(number % 10);
            number /= 10;
        }
        return sum;
    }

}

