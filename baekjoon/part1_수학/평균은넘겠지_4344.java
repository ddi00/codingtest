package part1_수학;

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
                    .mapToInt(Integer::parseInt).toArray());
        }

        for(int i=0; i<list.size(); i++){
            int[] arr = list.get(i);
            double mean = Arrays.stream(arr).average().orElse(0);
            int person = 0;
            for(int j=0; j < arr.length; j++){
                if(mean < arr[j]){
                    person++;
                }
            }
            double rate = ((double)person/arr.length) * 100;
            System.out.println(Math.round(rate * 1000)/1000.0 + "%");
        }
    }
}

