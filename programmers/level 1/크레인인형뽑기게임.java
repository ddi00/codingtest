import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 크레인인형뽑기게임 {

    public static int solution(int[][] board, int[] moves) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        int col;
        for(int i=0; i<moves.length; i++){
            col = moves[i]-1;
            for(int j=0; j<board[0].length; j++){
                if(board[j][col] != 0){
                    if(list.size() == 0){
                        list.add(board[j][col]);
                        board[j][col] = 0;
                    }else if(list.get(list.size()-1) == board[j][col]){
                        list.remove(list.size()-1);
                        answer += 2;
                    }else{
                        list.add(board[j][col]);
                    }
                    board[j][col] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
}
