package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수찾기_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int num;
        int count = length;
        for (int i = 0; i < arr.length; i++) {
            num = Integer.parseInt(arr[i]);
            if (num == 1 || num == 0) {
                arr[i] = "x";
            }

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    arr[i] = "x";
                    break;
                }
            }

            if(arr[i].equals("x")){
                count--;
            }
        }
        System.out.println(count);
    }
}
