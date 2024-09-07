package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int multi = 1;
        if(num == 0){
            System.out.println(1);
        }else{
            for(int i=1; i<=num; i++){
                multi *= i;
            }
            System.out.println(multi);
        }
    }
}
