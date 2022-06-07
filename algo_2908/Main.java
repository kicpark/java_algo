package git.algo_2908;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp_a = a;
        int tmp_b = b;
        boolean flag = true;
        while(tmp_a > 0 && tmp_b >0){
            if((tmp_a %10) > (tmp_b %10))break;
            else if((tmp_a %10) < (tmp_b %10)) {flag = false; break;}
            tmp_a /= 10;
            tmp_b /= 10;
        }

        if(flag){
            while(a > 0){
                System.out.print(a%10);
                a/=10;
            }
        }else {
            while(b > 0){
                System.out.print(b%10);
                b/=10;
            }
        }
    }
}
