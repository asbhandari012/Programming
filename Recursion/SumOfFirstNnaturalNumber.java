import java.util.*;

public class SumOfFirstNnaturalNumber {

    public static int resursion(int n){

        if(n == 1) return 1;

        return n+resursion(n-1);
    }
    

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        int n = ui.nextInt();
        System.out.println(resursion(n));
    }
}
