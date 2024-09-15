package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int length = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i< length; i++){
            int num2 = Integer.parseInt(st1.nextToken());
            if(num > num2){
                System.out.print(num2+" ");
            }
        }
    }
}
