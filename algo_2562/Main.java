package git.algo_2562;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int cnt = 0;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if (num > max) {
                cnt = i + 1;
                max = num;
            }
        }
        System.out.printf("%d\n%d", max, cnt);
    }
}
