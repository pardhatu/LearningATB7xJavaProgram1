package ex_2007204;

import java.util.Locale;
import java.util.Scanner;

public class lab93 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser name you wan to start ");
        String browser =sc.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("open chrome browser");
                break;
            case "firefox":
                System.out.println("open fire fox");
                break;
            case "edge":
                System.out.println("open edge");
                break;
            default:
                System.out.println("no such browser installed ");


        }
    }
}
