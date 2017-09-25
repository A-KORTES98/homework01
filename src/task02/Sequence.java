package task02;

import java.util.Scanner;

/**
 * Created by anton on 22.09.17.
 */
public class Sequence {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        double eps = 0;
        System.out.print("Enter eps(positive num): ");

        do{
            try{
                eps = Double.parseDouble(sc.nextLine());
                if (eps <= 0) throw new NumberFormatException();
            }
            catch(NumberFormatException e){
                System.out.print("Error!!!\nEnter positive num: ");
            }
        }while (eps <= 0);

        while (calculateNextEl(++i) > eps){}
        System.out.println("Index of maximal element that less then \"" + eps + "\" : " + i);
    }

    private static double calculateNextEl(int arg){
        return 1 / Math.pow(arg + 1, 2);
    }
}
