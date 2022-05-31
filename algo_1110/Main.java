package git.algo_1110;
import java.util.Scanner;

public class Main {
    public static int func(int n){
        int tmp_1 = n % 10;
        int tmp_2 = (n/10 + n%10)%10;
        return tmp_1*10 + tmp_2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int old_num = sc.nextInt();
        int cnt = 0;
        int tmp = old_num;
        do{
            tmp = func(tmp);
            cnt++;
        }while (tmp != old_num);
        System.out.println(cnt);
    }
}
