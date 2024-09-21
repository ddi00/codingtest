package part1;

import java.io.*;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[st.countTokens()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 블로그 공식 보고 품
        // (전체 길이 - 하루에 떨어지는 길이) / (하루 올라가는 길이 - 하루에 떨어지는 길이) 로 구하고 이 식의 나머지가 있을 경우는 + 1 해줘야함
        int days = (arr[2] - arr[1]) % (arr[0]-arr[1]) == 0 ? (arr[2] - arr[1]) / (arr[0]-arr[1])  : (arr[2] - arr[1]) / (arr[0]-arr[1]) +1;
        System.out.println(days);
    }
}
