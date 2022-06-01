package git.algo_4344;
import java.util.Scanner;

public class Main {
    public static void init_arr(int[] list , int N){
        for(int i = 0; i < N; i++) list[i] = 0;
    }
    public static double get_avg(int[] list , int N){
        double total = 0;
        for(int i = 0; i < N; i++) total += list[i];

        return total/N;
    }
    public static double get_per(int[] list , int N , double avg){
        double cnt = 0;
        for(int i = 0; i < N; i++) if(list[i] > avg) cnt++;
        return cnt/N*100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1001];
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            init_arr(arr, N);
            int K = sc.nextInt();
            for(int j = 0; j < K; j++) arr[j] = sc.nextInt();
            double res = get_per(arr, K, get_avg(arr, K));
            System.out.printf("%.3f%%\n", res);
        }
    }
}
