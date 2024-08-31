package part1_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 차이를최대로 {

    static int N;   //받을 숫자 개수
    static int maxSum;  //sum 중 가장 큰 값
    static boolean[] visited;   //방문했는지 확인하는 배열
    static int[] arr;   //받은 숫자들의 배열
    static int[] cal;   //자리교환한 원소들의 배열


    static int sum(int cal[]){  // sum 구하는 함수
        int sum =0;
        for(int i=0; i<cal.length -1; i++){
            sum += Math.abs(cal[i] - cal[i+1]);
        }
        return sum;
    }

    static void back(int depth){    //depth가 N이라면 sum을 구해서 maxSum과 sum 중 큰값을 maxSum으로 취함
        if(depth == N){
            maxSum = Math.max(maxSum, sum(cal));
            return;
        }

        for(int i=0; i<N; i++){     //depth를 늘리면서 원소들을 cal에 저장
            if(!visited[i]){
                visited[i] = true;
                cal[depth] = arr[i];
                back(depth+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        cal = new int [N];
        arr = new int [N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        back(0);
        System.out.println(maxSum);
    }
}
