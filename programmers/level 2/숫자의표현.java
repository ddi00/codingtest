public class 숫자의표현 {

    public static int solution(int n) {
        int answer = 1;
        int sum = 0;
        int sub = 1;
        if(n == 1||n==2){
            return 1;
        }
        for(int i=1; i<=n/2+1; i++){
            sum += i;
            if(sum>n){
                sum -= sub;
                sub++;
                while(true){
                    if(sum == n){
                        answer++;
                        break;
                    }else if(sum > n){
                        sum -= sub;
                        sub++;
                    }else if(sum < n){
                        break;
                    }
                }
            }else if(sum == n){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2));
    }
}
