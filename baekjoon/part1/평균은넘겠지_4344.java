package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 평균은넘겠지_4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<c; i++){
            String line = br.readLine();
            list.add(Arrays.stream(line.trim().substring(line.indexOf(" ")+1).split(" "))
                    .mapToInt(Integer::parseInt).toArray());    //list의 int 배열 숫자 원소로 넣어주기
        }

        for(int i=0; i<list.size(); i++){
            int[] arr = list.get(i);
            double mean = Arrays.stream(arr).average().orElse(0);   //평균 구하기
            int person = 0;
            for(int j=0; j < arr.length; j++){
                if(mean < arr[j]){
                    person++;   //평균을 이상인 사람의 수 구하기
                }
            }
            double rate = ((double)person/arr.length) * 100;    // 과반수 비율 구하기
            System.out.println(Math.round(rate * 1000)/1000.0 + "%"); //소수점 셋째자리까지 표현하기 위해 rate *1000 한후, 1000.0으로 나눠줌
        }
    }
}

