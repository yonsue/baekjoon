package conditional;
import java.util.*;

public class NullySoft_CodingTest_Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        if(M<45){
            H --;   // M(분)이 만약 44분 이라면 44-45이므로 시간이 H:59이 된다, 그걸 위해 1시간을 빼준다.
            M = 60-(45-M);  // 60분 - (45분 - 설정 분)
            if(H<0){    // 설정한 시간이 00시30분일 경우, 23:45가 출력되어야 한다.
                H=23;
            }
            System.out.println(H+":"+M);

        }else {
            System.out.println(H+":"+(M-45)); // 위 조건이 만족하지 않았을 때, M>=45이므로 입력한 값에서 (M-45) 만 해주고 출력만 하면된다.
        }
    }
    }
