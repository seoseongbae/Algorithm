class Solution {
    public String solution(String code) {
        String answer = "";
        int mode=0;
        for(int i=0;i<code.length();i++){
            if(mode==0){ //mode가 0일경우
                if(code.charAt(i)=='1'){ //문자가 1일경우 mode를 1로 변경
                    mode=1; 
                }else{
                    if(i%2==0){ //mode가 0이면서 짝수일경우 answer에 대입
                        answer+=code.charAt(i);
                    }   
                }
            }else if(mode==1){ // 모드가 1일경우
                if(code.charAt(i)=='1'){ //문자가 1일경우 mode를 0로 변경
                    mode=0;
                }else{
                    if(i%2!=0){ //모드가 1이면서 홀수일경우 answer에 대입
                        answer+=code.charAt(i);
                    }
                }
            }
        }
        if(answer==""){ //answer가 비어있을 경우
            answer="EMPTY";
        }
        return answer;
    }
}
