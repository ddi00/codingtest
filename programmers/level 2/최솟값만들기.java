import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {

    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int j=A.length -1;
        for(int i=0; i<A.length; i++){
            answer += A[i]*B[j];
            j--;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {

        int[] A= {1,2};
        int[] B={3,4};

        System.out.println(solution(A,B));
    }
}
