package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        Random random = new Random();
        return random.nextInt(7);
    }

    public static void generateGame(int times, int[] ucl, int[] answers) {
        int lives = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play");
        System.out.println("How many teams win the UCL trophy " + ucl[times] + " times?");

        while (lives > 0) {
            int userAnswer = scanner.nextInt();

            if(userAnswer == answers[times]) {
                System.out.println("Well done, you guessed it!");
                return;
            }

            lives--;

            if (lives == 1) {
                System.out.println("Bad answer, you have one more try");
            }
            else {
                System.out.println("Bad answer again, Game over!");
            }
        }

    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        generateGame(times, ucl, answers);
    }
}
