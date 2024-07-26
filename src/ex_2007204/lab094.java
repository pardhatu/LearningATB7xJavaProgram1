package ex_2007204;

import java.util.Scanner;

public class lab094 {
    public static void main(String[] args) {
        //switch is more improved
        // write a program for vowel is a,e,i,o,u

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character to check it is vowel are not");
        char user_input = sc.next().charAt(0);
   switch(user_input) {
       case 'a':
           System.out.println("it is vowel");
           break;
       case 'e':
           System.out.println("it is vowel");
           break;
           case 'i':
           System.out.println("it is vowel");
           break;
           case 'o':
           System.out.println("it is vowel");
           break;
           case 'u':
           System.out.println("it is vowel");
           break;
       default:
           System.out.println("it is concsonent");
           break;
   }
    }
}
