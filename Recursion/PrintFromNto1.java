import java.util.*;

public class PrintFromNto1 {

    public static void recursion(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }
    

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        int n = ui.nextInt();

        recursion(n);
    }
}
