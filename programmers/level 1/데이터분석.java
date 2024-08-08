import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 데이터분석 {

    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by){
        List<int[]> list = new ArrayList<>();
        String[] s = {"code","data","maximum","remain"};    //분류 기준 칼럼 배열
        int extIdx=0, sortIdx=0;            //ext의 인덱스, 정렬 인덱스

        for(int i=0; i<4; i++){             //4번 반복
            if(s[i].equals(ext)) extIdx = i;    //extidx 인덱스 설정
            if(s[i].equals(sort_by)) sortIdx = i;//sortIdx 인덱스 설정
        }

        final int si=sortIdx;

        for(int i=0; i<data.length; i++){
            if(data[i][extIdx] < val_ext) list.add(data[i]);        //val_ext보다 작은 값을 list에 추가
        }

        Collections.sort(list,(o1,o2) -> o1[si]-o2[si]);    //sort_by를 기준으로 오름차순 정렬
        return list;
    }
}
