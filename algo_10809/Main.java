package git.algo_10809;
import java.util.Scanner;

public class Main {
    public static void init_arr(int []arr){
        for(int i = 0; i < arr.length; i++)arr[i] = -1;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[26];
        init_arr(arr);
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            int tmp = str.charAt(i) - 'a';
            if(arr[tmp] != -1) continue;
            arr[tmp] = i;
        }

        for(int i = 0; i < arr.length; i++) System.out.printf("%d ",arr[i]);
    }
}
