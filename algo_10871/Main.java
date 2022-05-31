package git.algo_10871;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        for(int i = 0; i < N; i++){
            int tmp = sc.nextInt();
            if(tmp < target) System.out.printf("%d ",tmp);
        }
    }
}
