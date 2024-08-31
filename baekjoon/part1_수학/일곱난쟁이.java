package part1_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        //9명의 난쟁이 키 입력받아서 list에 넣기
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }

        int i, j;
        boolean finish = false;
        //sum에서 두 명의 키를 빼주며 100이 되는지 체크 -> 100이 되면 list에서 삭제
        for(i=0; i< 9; i++){
            if(finish) break;
            for(j=i+1; j<9; j++){
                if((sum - list.get(i) - list.get(j)) == 100){
                    sum = list.get(j);
                    list.remove(i);
                    list.remove(list.indexOf(sum));
                    finish = true;
                    break;
                }
            }
        }

        //list 오름차순 정렬
        Collections.sort(list);

        //list 요소 출력
        for(int li: list){
            System.out.println(li);
        }

    }
}
