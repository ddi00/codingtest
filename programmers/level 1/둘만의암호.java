
public class 둘만의암호 {

    public static String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i< skip.length(); i++) {
            alphabet = alphabet.replace(String.valueOf(skip.charAt(i)),"");
        }
        for(int i=0; i<s.length(); i++){
            int idx = (alphabet.indexOf(s.charAt(i)) + index) % alphabet.length();
            answer += alphabet.charAt(idx);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("poklol","difkw",20));
    }
}
