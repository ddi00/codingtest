public class 키패드누르기 {
    int[][] phone = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
    int[] leftLocation= {3, 0};
    int[] rightLocation= {3, 2};
    public String solution(int[] numbers, String hand) {
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftLocation[0] = phone[numbers[i]][0];
                leftLocation[1] = phone[numbers[i]][1];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rightLocation[0] = phone[numbers[i]][0];
                rightLocation[1] = phone[numbers[i]][1];
            } else {
                answer += getDistance(leftLocation, rightLocation, numbers[i], hand);
            }
        }
        return answer;
    }

    public String getDistance(int[] leftLocation, int[] rightLocation, int number, String hand) {
        int leftDist = Math.abs(leftLocation[0] - phone[number][0]) + Math.abs(leftLocation[1] - phone[number][1]);
        int rightDist = Math.abs(rightLocation[0] - phone[number][0]) + Math.abs(rightLocation[1] - phone[number][1]);
        String h = "";
        if (leftDist > rightDist) {
            rightLocation[0] = phone[number][0];
            rightLocation[1] = phone[number][1];
            h = "R";
        } else if (leftDist < rightDist) {
            leftLocation[0]= phone[number][0];
            leftLocation[1]= phone[number][1];
            h = "L";
        } else if (leftDist == rightDist) {
            if (hand.equals("right")) {
                rightLocation[0] = phone[number][0];
                rightLocation[1] = phone[number][1];
                h = "R";
            } else {
                leftLocation[0]= phone[number][0];
                leftLocation[1]= phone[number][1];
                h = "L";
            }
        }
        return h;
    }
}
