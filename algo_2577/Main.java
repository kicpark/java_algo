package git.algo_2577;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_cnt = new int[10];
        for (int i = 0; i < 10; i++) num_cnt[i] = 0;

        int a = 1;
        for(int i = 0; i < 3; i++) a *= sc.nextInt();
        while(a != 0){
            num_cnt[a%10]++;
            a /= 10;
        }

        for (int i = 0; i < 10; i++) System.out.println(num_cnt[i]);
    }
}
