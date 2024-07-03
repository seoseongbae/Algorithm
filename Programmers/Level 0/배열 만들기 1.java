class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int count=0;
        for(int i =1;i<=n;i++){
            if(i%k==0){
                count++; // i가 k의 배수인경우 count증가
            }
        }
        answer= new int[count];
        count=0;
        for(int i=1;i<=n;i++){
            if(i%k==0){ //i값이 k의 배수이면 answer배열에 추가
                answer[count++]=i;
            }
        }
        return answer;
    }
}
