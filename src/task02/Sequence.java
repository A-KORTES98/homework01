package task02;

import java.util.Scanner;

/**
 * Created by anton on 22.09.17.
 */
public class Sequence {
    public static void main(String[] args) {
        int i = 0;
        double eps = new Scanner(System.in).nextDouble();
        while (calculateNextEl(++i) > eps){}
        System.out.println("Index of maximal element that less then \"" + eps + "\" : " + i);
    }

    private static double calculateNextEl(int arg){
        return 1 / Math.pow(arg + 1, 2);
    }
}
