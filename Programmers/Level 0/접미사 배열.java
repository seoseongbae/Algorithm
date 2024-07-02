import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List list =new ArrayList();
        for(int i=0;i<my_string.length();i++){
            list.add(my_string.substring(i)); //문자열을 i부터 끝까지 자른 후 list에 저장.
        }
        answer=new String[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=(String)list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
