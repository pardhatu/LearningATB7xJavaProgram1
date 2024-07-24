package ex_2007204;

import java.util.Scanner;

public class lab090 {
    public static void main(String[] args) {
        //grade cal program

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage of the student");
        int score = sc.nextInt();

        char grade = 'f';

        if(score >= 90 && score <= 100)
           grade = 'A';
        else if (score >= 80 && score <= 89) {
           grade = 'B';
            
        } else if (score >= 70 && score <= 79) {
            grade = 'C';

        } else if (score >= 60 && score <= 69) {
            grade = 'D';

        } else if (score >= 0 && score <= 59) {
            grade = 'O';

        } else {
            System.out.println("Not attend the Exam ");
        }
        System.out.println("your grade  " + grade);
        sc.close();

    }
}
