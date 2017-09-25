package task04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by anton on 22.09.17.
 */
public class MaxSumPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of array's elements: ");
        int countOfEl = sc.nextInt();
        System.out.println("Enter array's elements: ");
        int[] arr = new int[countOfEl];

        for (int i = 0; i < countOfEl; i++) {
            arr[i] = sc.nextInt();
        }

        int maxPairSum;
        maxPairSum = arr[0] + arr[countOfEl - 1];
        for (int i = 1; i < (countOfEl + 1) / 2; i++) {
            int pairSum = arr[i] + arr[countOfEl - i - 1];
            maxPairSum = pairSum > maxPairSum ? pairSum : maxPairSum ;
        }

        System.out.println("Max sum of two opposite numbers: " + maxPairSum);
    }
}
