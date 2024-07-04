class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count=0;
       for(int i=0;i<num_list.length;i++){
           while(true){
               if(num_list[i]%2==0){ //짝수일경우
                   count++;
                   num_list[i]=num_list[i]/2;
               }else if(num_list[i]%2!=0&&num_list[i]!=1){ //홀수일경우 와 num_list배열에 값이 1이 아닌경우
                   num_list[i]=(num_list[i]-1)/2;
                   count++;
               }
               if(num_list[i]==1){
                   break;
               }
           }
           answer+=count;
           count=0;
       }
        return answer;
    }
}
