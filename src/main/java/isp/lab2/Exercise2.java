package isp.lab2;

import java.util.Scanner;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of points:");
        int points = scanner.nextInt();
        System.out.println("Lets check if a team has " + points + " points...");

        return points;
    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
        String message;

        switch (numberOfPoints) {
            case 49:
                message = "CFR Cluj has " + numberOfPoints + " points";
                break;
            case 46:
                message = "Universitatea Craiova " + numberOfPoints + " points";
                break;
            case 43:
                message = "FCSB has " + numberOfPoints + " points";
                break;
            case 42:
                message = "FC Botosani has " + numberOfPoints + " points";
                break;
            case 40:
                message = "Gaz Metan " + numberOfPoints + " points";
                break;
            case 39:
                message = "Astra Giurgiu " + numberOfPoints + " points";
                break;
            default:
                message = "No team from Liga 1 have " + numberOfPoints + " points";
                break;
        }

        return message;
    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
