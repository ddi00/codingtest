package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의개수_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        String[] arr = line.split(" ");
        int length = line.length() == 0? 0 : arr.length; //arr의 길이가 0이면 단어의 개수도 0, 0이 아니면 arr의 길이가 됨
        System.out.println(length);
    }
}
