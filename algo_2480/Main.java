package git.algo_2480;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d_1 = sc.nextInt();
        int d_2 = sc.nextInt();
        int d_3 = sc.nextInt();
        int res;

        if(d_1 == d_2 && d_1 == d_3) res = (10000 + d_1 * 1000);
        else if(d_1 == d_2 || d_1 == d_3) res = (1000 + d_1 * 100);
        else if(d_2 == d_3) res = (1000 + d_2 * 100);
        else{
            int max = -1;
            max = max > d_1 ? max : d_1;
            max = max > d_2 ? max : d_2;
            max = max > d_3 ? max : d_3;
            res = max*100;
        }
        System.out.println(res);
    }
}
