package git.algo_1546;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        int max = -1;
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int tmp = sc.nextInt();
            if(tmp > max) max = tmp;
            res+=tmp;
        }
        System.out.printf("%f",res = res / (max*N) * 100);
    }
}
