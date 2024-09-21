package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {

    //스코어 계산 메서드
    public static int checkScore(String str){
        int score = 0;  //최종 스코어를 나타내는 변수
        int ctnue = 0;  //연속된 값을 나타내는 변수
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == 'O'){   //'O'이면 ctnue 1증가, score에 ctnue 더해줌
                ctnue++;
                score += ctnue;
            }else{  //'O'가 아니면 ctnue를 0으로 초기화
                ctnue = 0;
            }
        }
        return score;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        for(int i=0; i< num; i++){
            arr[i] = br.readLine();
        }
        for(int i=0; i< num; i++){
            System.out.println(checkScore(arr[i]));
        }
    }
}
