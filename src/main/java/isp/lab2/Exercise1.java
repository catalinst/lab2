package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(10 - 2) + 2;
        int[] numbers = new int[randomNumber];

        System.out.println("Please enter " + randomNumber + " numbers.");

        for (int i = 0; i <randomNumber ; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double sum = 0;

        for (int i = 0; i < userNumbers.length; i++) {
            sum += userNumbers[i];
        }

        return sum / userNumbers.length;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
