import java.util.HashMap;
import java.util.Map;

public class 롤케이크자르기 {

    public static int solution(int[] topping) {
        int answer = 0;

        //해시맵 사용한 이유? key값 중복이 불가하기 때문 (문제에서 한 종류의 토핑이 여러개 있더라도 1개로 취급하기 떄문)
        //형이 원 topping 전체를 다 차지함, 동생이 하나씩 뻈어오면서 형의 토핑 종류와 동생의 토핑 종류를 비교, 같다면 answer++
        //getOrDefault(key, dafulatValue)  -> key가 존재하지 않으면 defaultValue 리턴, 존재하면 key의 value값 리턴

        Map<Integer, Integer> hyung = new HashMap<>();
        Map<Integer, Integer> dongsaeng = new HashMap<>();
        for(int one:topping){
            hyung.put(one, hyung.getOrDefault(one, 0)+1);
        }

        for(int one:topping){
            dongsaeng.put(one, dongsaeng.getOrDefault(one, 0)+1);
            if(hyung.get(one)-1 == 0){
                hyung.remove(one);
            }else{
                hyung.put(one, hyung.get(one) -1);
            }

            if(hyung.size() == dongsaeng.size()){
                answer++;
            }
        }
        return answer;
    }
}
