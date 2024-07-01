class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i =0;i<numLog.length-1;i++){
            if((numLog[i]+1)==numLog[i+1]){ //numLog[i]에 1더한값이 그 다음 값과 같으면
                answer+="w";
            }else if((numLog[i]-1)==numLog[i+1]){ //numLog[i]에 1뺀값이 그 다음 값과 같으면
                answer+="s";
            }else if((numLog[i]+10)==numLog[i+1]){ //numLog[i]에 10더한값이 그 다음 값과 같으면
                answer+="d";
            }else if((numLog[i]-10)==numLog[i+1]){ //numLog[i]에 10뺀값이 그 다음 값과 같으면
                answer+="a";
            }
        }
        return answer;
    }
}
