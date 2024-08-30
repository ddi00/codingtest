public class 숫자변환하기 {

    public static int solution(int x, int y, int n) {
        int[] dp = new int[y+1];    //y값에 맞게 배열 생성

        for(int i=x; i< y+1;i++){       //x부터 y까지 순회
            if(i != x && dp[i] == 0){   //i는 x가 아니고 초기값 0인 경우
                dp[i] = -1;             // y가 될 수 없으므로 -1
                continue;
            }

            if(i*2 <= y){       //i*2가 y이하라면
                dp[i*2] = (dp[i*2] == 0 )? dp[i] + 1 : Math.min(dp[i]+1, dp[i*2]);  //해당자리의 값이 0이면 dp[i]+1을, 0이 아니면 dp[i]+1과 dp[i*2]의 최소값으로
            }
            if(i*3 <= y){       //i*3이 y이하라면
                dp[i*3] = (dp[i*3] == 0)? dp[i]+1 : Math.min(dp[i]+1, dp[i*3]); //해당자리의 값이 0이면 dp[i]+1을, 0이 아니면 dp[i]+1과 dp[i*3]의 최소값으로
            }
            if(i+n <= y){       //i+n이 y이하라면
                dp[i+n] = (dp[i+n] == 0)? dp[i] +1 : Math.min(dp[i]+1, dp[i+n]);    //해당자리의 값이 0이면 dp[i]+1을, 0이 아니면 dp[i]+1과 dp[i+n]의 최소값으로
            }
        }
        return dp[y];
    }

    public static void main(String[] args) {
        System.out.println(solution(10,40,5));
    }
}
