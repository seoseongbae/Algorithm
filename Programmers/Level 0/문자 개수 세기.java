class Solution {
    public int[] solution(String my_string) {
        int[] answer= new int[52];
		for(int i=0;i<my_string.length();i++) {
			if(my_string.charAt(i)>='a') { //문자가 a보다클경우
				answer[my_string.charAt(i)-71]+=1; // 소문자는 배열의 26번째 부터 시작하므로 a(97)에 71을 뺌
			}else if(my_string.charAt(i)<='Z'){ //문자가 Z보다 작을경우
				answer[my_string.charAt(i)-65]+=1; // 대문자는 배열의 0번쨰 부터 시작해야함으로 A(65)에 A값을 뺌
			}
		}
        return answer;
    }
}
