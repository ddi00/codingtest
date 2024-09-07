package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    static int N;       //입력받은 숫자 N (N X N의 N)
    static int[] board;     //체스판 1차원 배열로 설정  board의 인덱스는 열, 인덱스에 해당하는 값은 행을 뜻함
                            // board[1] = 2   : 2행 1열,  board[2] = 0 : 0행 2열
    static int count;       //경우의 수


    static void backTracking(int queenCol) {
        //queenCol은 queen의 열 위치를 뜻함. queenCol = 0 이면 -> queen은 칼럼 0에 위치
        //queenCol이 N이면 (0~ N-1열까지 queen을 위치시켰다는 의미이기 때문) 경우의수 count를 1 증가시킴
        if (queenCol == N) {
            count++;
            return;
        }

        //0에서 N-1까지 반복
        //여기서 i는 행을 의미 NXN이므로 칼럼도 N개, 행도 N개임
        for (int i = 0; i < N; i++) {
            board[queenCol] = i;    //i행 queenCol열 // board[1] = 2   : 2행 1열,  board[2] = 0 : 0행 2열
            if (queenPossible(queenCol)) {      //해당 행과 열 위치에 queen을 위치시킬 수 있는지
                backTracking(queenCol + 1); //위치시킬수 있다면 queenCol+1로 다음 열에 queen을 위치시킬 수 있는지 알아본다.(재귀함수로)
            }
        }
    }

    //해당 위치에 queen을 위치시킬 수 있는지를 리턴한다.
    //퀸은 대각선 같은 행, 같은 열에 위치할 수 없다.
    static boolean queenPossible(int col) {
        //0번 열에서 col-1 열까지 반복(즉, 이전 퀸들의 위치를 통해 현재 col에 queen을 놓을 수 있는지를 확인하는 거임)
        for (int i = 0; i < col; i++) {
            if (board[col] == board[i]) {   //col의 행 == i의 행 같다면 col의 위치에 queen을 놓을 수 없음!(같은 행에 퀸을 위치 시킬 수 없기 때문)
                return false;
            } else if (Math.abs(col - i) == Math.abs(board[col] - board[i])) {  //대각선 위치에 놓여있는지 확인(대각선 위치일 경우 해당 열끼리의 차(col - i)와
                                                                                // 해당 행끼리의 차(board[col] - board[i])가 같음.
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N];
        backTracking(0);
        System.out.println(count);
    }
}
