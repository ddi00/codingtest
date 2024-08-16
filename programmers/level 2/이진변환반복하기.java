public class 이진변환반복하기 {

    //Integer.toBinaryString(5);   --> 101
    //s.replaceAll("0","");

    public static int[] zeroCnts(String str){
        int[] arr = {0,0};
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                arr[0]++;
            }
        }
        arr[1] = str.length() - arr[0];
        return arr;
    }

    public static String binary(int cnts){
        StringBuilder sb = new StringBuilder("");
        while(true){
            if(cnts == 0){
                break;
            }
            sb.append(cnts%2);
            cnts/=2;
        }
        return sb.reverse().toString();
    }

    public static int[] solution(String s) {
        int[] answer = {0,0};
        String str = s;
        while(true){
            if(str.equals("1")) break;
            int[] arr = zeroCnts(str);
            answer[1] += arr[0];
            str = binary(arr[1]);
            answer[0]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = solution("01110");
        System.out.println(arr[0]+" "+arr[1]);
    }
}
