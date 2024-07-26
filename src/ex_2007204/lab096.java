package ex_2007204;

public class lab096 {
    public static void main(String[] args) {
        // two same condition can not be in same switch
        int a = 10;
        switch(a){

            case 98:
                System.out.println("same switch");
            //case 98:
                System.out.println("it can not be same switch");
        }
    }
}
