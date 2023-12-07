package conditional;
import java.util.*;

public class NullySoft_CodingTest_Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        if(M<45){
            H --;                   // q
            M = 60-(45-M);
            if(H<0){
                H=23;
            }
            System.out.println(H+":"+M);

        }else {
            System.out.println(H+":"+(M-45));
        }
    }
    }
