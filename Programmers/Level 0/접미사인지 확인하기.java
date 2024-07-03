import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List list = new ArrayList();
        for(int i=0;i<my_string.length();i++){ //접미사를 list에 저장
            list.add(my_string.substring(i));
        }
        for(int i=0;i<list.size();i++){
            if(is_suffix.equals(list.get(i))){ //비교하려는 값이 존재할경우 answer를 1 대입
                answer=1;
                break;
            }else
            {
                answer=0;
            }
        }
        return answer;
    }
}
