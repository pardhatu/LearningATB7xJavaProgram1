package ex_2007204;

import java.util.Scanner;

public class lab092 {
    public static void main(String[] args) {
            // Switch condition
        // weekdays (if we print the no 1-7 we will get weekdays

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day you will get the week of the day");
        int day = sc.nextInt();

        switch(day){
            case 1 :
                System.out.println("mon");
                break;
                case 2 :
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thr");
            break;
                case 5 :
                System.out.println("frd");
            break;
            case 6:
                System.out.println("sat");
            break;
            case 7:
                System.out.println("sun");

    }
        System.out.println("out side the loop");
    }
}
