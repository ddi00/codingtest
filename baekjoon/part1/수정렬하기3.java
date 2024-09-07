package part1;

import java.io.*;

public class 수정렬하기3 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i=0; i<arr.length; i++){
            while(arr[i] > 0){
                bw.write(i+"\n");
                arr[i]--;
            }
        }
        bw.flush();
    }
}
