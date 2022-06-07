package git.algo_1157;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[26];
        int max = -1;
        int cnt = 0;

        String str = sc.next();
        str = str.toUpperCase();


        for(int i = 0; i < arr.length; i++) arr[i] = 0;
        for(int i = 0; i < str.length(); i++) arr[str.charAt(i) - 'A']++;
        for(int i = 0; i < arr.length; i++) if(arr[i] > max) max = arr[i];
        for(int i = 0; i < arr.length; i++) if(arr[i] == max) cnt++;
        if(cnt > 1) {System.out.println("?"); return;}
        for(int i = 0; i < arr.length; i++) if(arr[i] == max) {System.out.println((char)('A' + i)); break;}
    }
}
