import java.util.ArrayList;
import java.util.List;

public class 하노이의탑 {
    //하노이탑 수행과정을 담을 list
    static List<ArrayList<Integer>> list = new ArrayList<>();

    public static void hanoi(int n, int start, int to, int mid){
        ArrayList<Integer> arrList = new ArrayList<>();  //하노이탑 start, to를 담을 list
        arrList.add(start);     //arrList에 start를 담는다
        arrList.add(to);        //arrList에 to를 담는다
        if(n==1){           //원판이 1개라면
            list.add(arrList);      //그대로 start -> to로 원판을 이동
        }else{
            hanoi(n-1, start,mid,to);       // n-1개의 원판을 start에서 mid로 이동
            list.add(arrList);              // 마지막 원반 1개를 start-> to로 이동
            hanoi(n-1,mid,to,start);      // n-1개의 원반을 mid에서 to로 이동
        }
    }
    public static List<ArrayList<Integer>> solution(int n) {
        hanoi(n,1,3,2);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));

    }
}


