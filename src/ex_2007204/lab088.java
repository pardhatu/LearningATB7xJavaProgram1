package ex_2007204;

import java.util.Scanner;

public class lab088 {
    public static void main(String[] args) {
        // max number in two inputs

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number1");
        int num1 = sc.nextInt();


        System.out.println(" enter the number2");
        int num2 = sc.nextInt();

        //System.out.println(Math.max(num1,num2));

        if(num1 > num2) System.out.println(num1);
        else if (num1 < num2) {
            System.out.println(num2);

        }
        else  {
            System.out.println("equal");
        }




    }
}
