class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str= my_string.split(""); //split함수로 배열에 값 추가
        for(int i=0;i<indices.length;i++){
            str[indices[i]]="0"; //indices에 있는 값을  i로 받아와 str배열에 i번째 있는 값을 0으로 변환
        }
        for(int i=0;i<str.length;i++){
            if(str[i]!="0"){ //str배열에 0이 아닌값만 answer에 추가
                answer+=str[i];
            }
        }
        return answer;
    }
}
