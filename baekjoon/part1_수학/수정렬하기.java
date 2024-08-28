package part1_수학;

import java.io.*;

public class 수정렬하기 {

    static void quick_sort(int[]arr, int start, int end){
        if(start >= end) return;

        int part = partition(arr,start,end);
        quick_sort(arr,start,part-1);
        quick_sort(arr,part,end);
    }

    static int partition(int[]arr, int start, int end){
        int pivot = arr[(start+end)/2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i=0; i<num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        quick_sort(arr,0,arr.length-1);
        for (int i:arr){
            bw.write(i+"\n");
        }
        bw.flush();
    }
}
