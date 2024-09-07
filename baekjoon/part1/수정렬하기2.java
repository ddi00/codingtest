package part1;
import java.io.*;

public class 수정렬하기2 {

    //퀵정렬은 시간초과됨 -> 카운팅 정렬로 통과!
    //n의 범위가 -1,000,000 ~ 1,000,000 이므로 기준점을 1,000,000으로하고 배열 범위를 2,000,001로 함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];
        for (int i=0; i<num; i++){
            arr[Integer.parseInt(br.readLine())+1000000] = true;    //숫자를 입력받아 기준점 1,000,000을 더하여 해당 인덱스에 true 저장
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]){ //arr[i]가 true라면
                bw.write(i-1000000+"\n"); //bw에 담기
            }
        }
        bw.flush(); //출력하기
    }
}
