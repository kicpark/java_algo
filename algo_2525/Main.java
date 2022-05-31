package git.algo_2525;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        if(min + time >= 60)
        {
            int cur = (min + time) / 60;
            int mod = (min + time) % 60;
            hour += cur;
            min = mod;
        }else min += time;

        if(hour >= 24) hour -= 24;

        System.out.println(hour + " " + min);

    }
}
