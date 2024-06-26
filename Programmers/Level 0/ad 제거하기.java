class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int count=0;
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){//ad라는 문자열이 존재하지 않을경우
                count++;//answer배열 크기 지정해주기 위한 count
            }
        }
        answer=new String[count];
        count=0;
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
               answer[count++]=strArr[i];
            }
        }
        return answer;
    }
}
