package git.algo_1316;
import java.util.Scanner;

public class Main {
    public static void init_arr(int[] arr){
        for(int i = 0; i < arr.length; i++) arr[i] = 0;
    }

    public static boolean func(String str, int[] arr){
        char c = str.charAt(0);
        int idx = c - 'a';
        arr[idx] = 1;
        for(int i = 1; i < str.length(); i++){
            if(c == str.charAt(i)) continue;
            else {
                c = str.charAt(i);
                idx = c - 'a';
                if(arr[idx] == 1) return false;
                else arr[idx] = 1;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[26];
        int cnt = 0;
        for(int i = 0; i < N; i++){
            init_arr(arr);
            String str = sc.next();
            if(func(str, arr)) cnt++;
        }

        System.out.println(cnt);
    }
}
