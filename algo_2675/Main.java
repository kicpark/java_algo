package git.algo_2675;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i = 0; i < test_case; i++){
            int num = sc.nextInt();
            String str = sc.next();
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < num; k++) System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
