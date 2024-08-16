import java.util.Queue;
import java.util.Stack;

public class 올바른괄호 {

    public static boolean solution(String s){
        boolean answer = true;
        String str[] = s.split("");
        int r = 0;
        int l = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals("(")){
                r++;
            }else{
                l++;
            }

            if(r < l){
                return false;
            }
        }

        if(r != l){
            answer = false;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("(())()"));
    }
}
