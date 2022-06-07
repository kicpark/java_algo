package git.algo_2941;
import java.util.Scanner;

/*

č   c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=

*/

public class Main {
    public static void init_arr(int[] arr){
        for(int i = 0; i < arr.length; i++) arr[i] = 0;
    }

    public static void set_arr(int[] arr, int start, int end){
        for(int i = start; i < end; i++) arr[i] = 1;
    }

    public static int func(String str, String cro_alpha, int[] arr){
        int i = 0;
        int cnt = 0;
        while(i < str.length())
        {
            i = str.indexOf(cro_alpha , i);
            if(i == -1)break;
            if(arr[i] == 1){i += cro_alpha.length(); continue;}
            set_arr(arr, i, i + cro_alpha.length());
            cnt++;
            i += cro_alpha.length();
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[100];
        init_arr(arr);
        int cnt = 0;
        String[] cro_alpha = {"c=" ,"c-" ,"dz=" ,"d-" ,"lj", "nj" ,"s=" ,"z="};
        for(int i = 0; i < cro_alpha.length; i++) cnt += func(str, cro_alpha[i], arr);
        for(int i = 0; i < str.length(); i++) if(arr[i] == 0) cnt++;
        System.out.print(cnt);
    }
}
