package part1_수학;

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
    }
}
