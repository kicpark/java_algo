package git.algo_8393;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n*(n+1)/2;

        System.out.println(res);
    }
}
