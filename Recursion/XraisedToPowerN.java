import java.util.*;

public class XraisedToPowerN {
    

    public static int powerRecusion(int n, int x) {

        if(x == 0) return 1;

        return n * powerRecusion(n, x-1);
        
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        int n = ui.nextInt();
        int x = ui.nextInt();
        System.out.println(powerRecusion(n , x));
    }
}
