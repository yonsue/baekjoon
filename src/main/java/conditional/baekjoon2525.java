package conditional;
//23.12.08
import java.util.*;
public class baekjoon2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 시간을 입력하시오.");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println("조리 시간을 설정하시오.");
        int C = scanner.nextInt();

        if((B+C)>59){
            ++A;
            B = (B+C)-60;
            System.out.println(A+""+B);
            if(A>23){
                A=00;
                System.out.println(A+""+B);
            }
            }else{
            System.out.println(A+":"+(B+C));
        }

    }
}
