package Recursion;
import java.util.*;

public class PrintingNumber1toN {

    public static void recursion(int n){
        if(n == 0){
            return;
        }

        recursion(n-1);
        System.out.print(n + " ");
    }
    

    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);

        int n = ui.nextInt();

        recursion(n);
    }
}
