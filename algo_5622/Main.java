package git.algo_5622;
import java.util.Scanner;

public class Main {
    public static int func(char c){
            if(c >= 'A' && c <= 'C') return 3;
            else if (c >= 'D' && c <= 'F') return 4;
            else if (c >= 'G' && c <= 'I') return 5;
            else if (c >= 'J' && c <= 'L') return 6;
            else if (c >= 'M' && c <= 'O') return 7;
            else if (c >= 'P' && c <= 'S') return 8;
            else if (c >= 'T' && c <= 'V') return 9;
            else if (c >= 'W' && c <= 'Z') return 10;
            return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = 0;
        for(int i = 0; i < str.length(); i++)res += func(str.charAt(i));

        System.out.println(res);
    }
}
