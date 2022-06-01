package git.algo_1065;
import java.util.Scanner;

public class Main {
    public static boolean func(int n){
        if(n < 100) return true;
        int tmp = n % 10;
        n /= 10;
        int tmp_2= n%10;
        int d = tmp - tmp_2;
        while(n >= 10){
            tmp = n%10;
            n /= 10;
            tmp_2 = n%10;
            if(tmp - tmp_2 != d) return false;
            d = tmp - tmp_2;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= N; i++) if(func(i)) cnt++;
        System.out.println(cnt);
    }
}
