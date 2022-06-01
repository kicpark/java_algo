package git.algo_4673;
import java.util.Scanner;

public class Main {
    public static void init_arr(int[] arr){
        for(int i = 0; i < arr.length; i++) arr[i] = 0;
    }
    public static void func(int num, int[] arr){
        int tmp = num;
        while(num > 0){
            tmp += num % 10;
            num /= 10;
        }
        if(tmp > 10000) return;
        else {
            arr[tmp]++;
            func(tmp, arr);
        }
    }
    public static void main(String[] args){
        int[] arr = new int[10001];
        init_arr(arr);
        for(int i = 1; i < 10000; i++)func(i, arr);
        for(int i = 1; i < 10000; i++)if(arr[i] == 0) System.out.println(i);
    }
}
