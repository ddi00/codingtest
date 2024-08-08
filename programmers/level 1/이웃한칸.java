public class 이웃한칸 {
    public static int 솔루션(String[][] board, int h, int w) {
        int count = 0;
        int[] dh = {0,1,-1,0};     //h 방향
        int[] dw = {1,0,0,-1};      //w 방향
        String color = board[h][w];     // hw 위치의 색깔
        for(int i=0; i<4; i++){         // 4번 반복
            int hh = h+dh[i];        //h에서 dh[i]를 더함
            int ww = w+dw[i];       //w에서 dw[i]를 더함  --> hw의 이웃한 칸들을 조회할 수 있음

            //인덱스 값이 0 이상이고, 각 행과 열의 길이보다 작을 때
            if(hh >= 0 && hh < board.length && ww >= 0 && ww < board[0].length){
                if(board[hh][ww].equals(color)){    //그 인덱스의 색깔이 color 변수와 같다면
                    count ++;   //count+1
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] board1 = new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        System.out.println(솔루션(board1, 1, 1));
    }
}
