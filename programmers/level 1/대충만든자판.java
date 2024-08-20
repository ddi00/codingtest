import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int cnt;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                String key = String.valueOf(keymap[i].charAt(j));
                if(map.containsKey(key)){
                    if(map.get(key) > (j+1)){
                        map.put(key, (j+1));
                    }
                }else{
                    map.put(key, (j+1));
                }
            }
        }

        for(int i=0; i < targets.length; i++){
            cnt= 0;
            for(int j=0; j< targets[i].length(); j++){
                String key = String.valueOf(targets[i].charAt(j));
                if(map.containsKey(key)){
                    cnt+=map.get(key);
                }else{
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;
        }

        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] keymap = {"A"};
        String[] targets = {"ZDD"};
        solution(keymap, targets);
    }
}
