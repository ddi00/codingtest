public class 이웃한칸 {
    public static int 솔루션(String[][] board, int h, int w) {
        int count = 0;
        int[] dh = {0,1,-1,0};     //
        int[] dw = {1,0,0,-1};
        String color = board[h][w];
        for(int i=0; i<4; i++){
            int hh = h+dh[i];
            int ww = w+dw[i];
            if(hh >= 0 && hh < board.length && ww >= 0 && ww < board[0].length){
                if(board[hh][ww].equals(color)){
                    count ++;
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
