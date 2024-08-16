package part1_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의개수_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        String[] arr = line.split(" ");
        int length = line.length() == 0? 0 : arr.length;
        System.out.println(length);
    }
}
