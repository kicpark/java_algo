package git.algo_11720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int res = 0;
        for(int i = 0; i < N; i++) res += (int)str.charAt(i) - '0';

        System.out.println(res);
    }
}
