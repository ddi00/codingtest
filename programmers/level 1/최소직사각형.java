public class 최소직사각형 {
    public static int solution(int[][] sizes) {
        int max = 0;
        int maxOfMins = 0;
        for (int i = 0; i < sizes.length; i++) {
            max = Math.max(max, Math.max(sizes[i][0], sizes[i][1]));    //max 값 계산(이차원 배열을 돌면서 행의 열끼리 비교)
            maxOfMins = maxOfMins < Math.min(sizes[i][0], sizes[i][1]) ? Math.min(sizes[i][0], sizes[i][1]) : maxOfMins;    //maxOfMins 값 계산
        }
        return max * maxOfMins;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
