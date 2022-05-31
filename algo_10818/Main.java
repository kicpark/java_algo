package git.algo_10818;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 1000000 + 1;
        int max = min * (-1);

        for(int i = 0; i < N; i++){
            int tmp = sc.nextInt();
            if(min > tmp) min = tmp;
            if(max < tmp) max = tmp;
        }

        System.out.println(min + " " + max);
    }
}
