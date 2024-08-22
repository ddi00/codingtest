package part1_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class 하노이탑 {
    public static StringBuilder sb = new StringBuilder("");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        //2의 100승은 int 초과 -> BinInteger 사용해야함
        BigInteger cnts = BigInteger.TWO.pow(num).subtract(BigInteger.ONE);
        sb.append(cnts + "\n");
        if (num > 20) {
            System.out.println(cnts);
        } else {
            hanoi(num, 1, 2, 3);
            System.out.println(sb);
        }
    }

    public static void hanoi(int num, int start, int via, int to) {
        if (num == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        hanoi(num - 1, start, to, via);
        sb.append(start + " " + to + "\n");
        hanoi(num - 1, via, start, to);
    }
}
