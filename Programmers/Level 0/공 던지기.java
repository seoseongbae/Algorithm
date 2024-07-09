class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count=0; //k만큼 돌아가는지 확인하는 변수
	   int cnt=0;
	   while(true) { 
		   if(count==k) { //count 가 k값이 같을 경우 중지.
			   break;
		   }
		   answer=numbers[cnt]; //answer에 현재 numbers배열에 있는 값 저장.
		   if(cnt==numbers.length-1) { //cnt값이 배열의 길이랑 같을경우 (배열의 길이는 -1) //+2를 해야함으로 0으로 바꿔준 뒤 1을 추가.
			   cnt=0; 
			   cnt+=1;
		   }else if(cnt+2<=numbers.length-1) { //cnt+2한값이 배열의 길이의 -1한 값보다 작거나 같을경우 cnt에 +2
			   cnt+=2;			   
		   }else if(cnt+2>numbers.length-1){ //cnt+2한값이 배열의 길이보다 클 경우 2칸만 지나가기때문에 cnt를 0으로 초기화
			   cnt=0;
		   }
		   공 던지기
		   count++;
	   }
        return answer;
    }
}
