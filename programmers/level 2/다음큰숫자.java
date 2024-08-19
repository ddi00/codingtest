public class 다음큰숫자 {

    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int oneCnts = 0;

        //str에 01이 포함되면 -> 10으로 바꿈
        for(int i=str.length()-2; i>=0; i--){
            if(str.charAt(i) == '0' && str.charAt(i+1) == '1'){
                sb.append(str.substring(0,i));
                sb.append("10");
                //
                if(i+2 < str.length()){
                    for(int j = i+2; j<str.length(); j++){
                        if(str.charAt(j)=='1'){
                            oneCnts++;
                        }else{
                            sb.append("0");
                        }
                    }
                }

                for(int k=0; k<oneCnts; k++){
                    sb.append("1");
                }
                break;
            }
        }

        //str에 01이 포함되지 않았을 경우
        if(sb.length() == 0){
            oneCnts = 0;
            sb.append("10");
            for(int i=1; i<str.length(); i++){
                if(str.charAt(i) == '1'){
                    oneCnts++;
                }else{
                    sb.append("0");
                }
            }
            for(int i=0; i<oneCnts;i++){
                sb.append("1");
            }
        }

        //2진수 -> 10진수
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '1'){
                answer += Math.pow(2,sb.length() - (i+1));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(56));
        System.out.println(Integer.toBinaryString(56));
    }
}
