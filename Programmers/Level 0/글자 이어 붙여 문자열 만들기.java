class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0;i<index_list.length;i++){ //찾아야할 인덱스 반복문 실행
            answer+=my_string.charAt(index_list[i]); //charAt로 문자를 찾아 answer에 추가
        }
        return answer;
    }
}
