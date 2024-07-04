class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a=0;
        int b=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2!=0){ //홀수일경우
                a+=num_list[i];
            }else{ //짝수일 경우
                b+=num_list[i];
            }
        }
        if(a>b){
            answer=a;
        }else{
            answer=b;
        }
        return answer;
    }
}
