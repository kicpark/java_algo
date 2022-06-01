package git.algo_8958;
import java.util.Scanner;

public class Main {
    public static int func(String str){
        int cnt = 0;
        int res = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'O') cnt++;
            else cnt = 0;
            res += cnt;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            System.out.println(func(str));
        }
    }
}
