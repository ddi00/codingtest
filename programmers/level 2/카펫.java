public class 카펫 {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = (int) Math.sqrt(sum)+1; i >= 1; i--) {
            if (sum % i == 0) {
                answer[0] = Math.max(i, sum/i);         //큰 값이 가로
                answer[1] = Math.min(i, sum/i);         //작은 값이 세로
                if((answer[0] - 2) * (answer[1]-2) ==  yellow){ //노란색의 면적 일치 여부
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,2));
    }
}
