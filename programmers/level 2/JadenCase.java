public class JadenCase {

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstChar = true;  // 단어의 첫 문자 여부를 체크하기 위한 변수
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                isFirstChar = true;  // 공백이 나오면 다음 문자는 첫 문자로 간주
            } else if (isFirstChar) {
                answer.append(Character.toUpperCase(c));
                isFirstChar = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }
}
