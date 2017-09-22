package task03;

import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by anton on 22.09.17.
 */
public class TableArgsAndValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double h;

        System.out.print("Enter a:  ");
        a = sc.nextDouble();

        System.out.print("Enter b (must be grand then a):  ");
        b = sc.nextDouble();

        System.out.print("Enter h:  ");
        h = sc.nextDouble();

        Formatter resTable = new Formatter();
        resTable.format("%12s  |  %12s\n", "argument", "function");
        for (int i = 0; a < b ; i++) {
            resTable.format("%12.6f  |  %12.6f\n", a, func(a));
            a += h;
        }
        System.out.println(resTable);


    }

    static double func(double arg){
        return Math.tan(2 * arg) - 3;
    }
}
