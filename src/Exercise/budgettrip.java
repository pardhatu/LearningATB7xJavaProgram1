package Exercise;

import java.util.Scanner;

public class budgettrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your budget package ");
        int pack = sc.nextInt();

        if(pack > 10000) System.out.println("we are travelling with in state");
        else if (pack > 20000) {
            System.out.println("we are going to other state in india ");
        } else if (pack > 45000) {
            System.out.println("we will go to abroad");

        }else System.out.println("enjoy in home ");

    }
}
