package git.algo_2588;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prc_1 = b %10;
        int prc_2 = b% 100;
        int prc_3 = b/100;

        System.out.println(a * prc_1);
        System.out.println((a * prc_2 - a*prc_1)/10);
        System.out.println(a * prc_3);
        System.out.println(a * b);
    }
}
