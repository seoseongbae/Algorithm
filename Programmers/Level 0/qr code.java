class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i=0;i<code.length();i++){
            if(i%q==r){ //인덱스를 q로 나눈 나머지 값이 r인경우
                answer+=code.charAt(i); //answer에 code에 i번째 단어 추
            }
        }
        return answer;
    }
}
