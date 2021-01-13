package isp.lab2;

import java.util.Arrays;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] vector = new int[n];
        vector[0] = 1;
        vector[1] = 2;

        for (int i = 2; i < vector.length; i++) {
            vector[i] = vector[i - 1] * vector[i - 2];
        }

        return vector;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        int[] vector = new int[n];

        if (n == 1) {
            vector[0] = 1;
            return vector;
        } else if (n == 2 ) {
            vector[0] = 1;
            vector[1] = 2;
            return vector;
        } else {
            // n=3  -> v2=v1*v0   v2: 2  v1:2 * v0: 1
            vector[n-1] = generateRandomVectorRecursively(n-1)[n-2] * generateRandomVectorRecursively(n-2)[n-3];
            return vector;
        }

    }

    public static void main(String[] args) {
        // TODO: print the vectors
        System.out.println(Arrays.toString(generateVector(10)));
        System.out.println(Arrays.toString(generateRandomVectorRecursively(4)));
    }
}
