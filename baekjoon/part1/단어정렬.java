package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int num = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>();
        //길이 순대로 정렬
        //길이가 같다면 사전순으로 정렬
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            set.add(br.readLine());
        }
        String[] strArr = new String[set.size()];

        int idx = 0;
        for (String str : set) {
            strArr[idx] = str;
            idx++;
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }
            }
        });


        for (String str2 : strArr) {
            System.out.println(str2);
        }
    }
}
