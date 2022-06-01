package git.algo_3052;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_cnt = new int[42];
        int cnt = 0;
        for (int i = 0; i < 42; i++) num_cnt[i] = 0;

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (num_cnt[a % 42]++ == 0) cnt++;
        }

        System.out.println(cnt);
    }
}
