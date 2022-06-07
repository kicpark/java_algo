package git.algo_1152;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') flag = true;
            else if(flag == true) {cnt++; flag = false;}
        }
        System.out.println(cnt);
    }
}
