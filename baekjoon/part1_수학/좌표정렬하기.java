package part1_수학;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[num][2];
        for(int i=0; i<num; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){ //x좌표가 같으면 y좌표로 비교(오름차순)
                    return o1[1] - o2[1];   //양수면 자리 교환, 음수면 그대로
                }else{
                    return o1[0] - o2[0];   //x좌표가 다르면 x좌표로 비교(오름차순)
                }
            }
        });

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
