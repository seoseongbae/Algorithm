//배열 크기 2를 선언하여 초기 값과 같으면 0번째 +1를 해주고, 다르면 1번째에 +1해줘 배열 안에 값 비교하여 확인.

class Solution {
    public int solution(String s) {
        int answer = 0;
        int []arr =new int[2]; //비교할 배열 선언
		int c=0;
		for(int i=1;i<=s.length();i++) {
			if(arr[0]==0) { //비교할 처음값 확인
				c = i-1;//문자열 나눌 기준값.
				arr[0]++; 
			}else if(s.charAt(c)==s.charAt(i-1)) { //초기값과 그다음값 이 같을경우 기준되는값 증가
				arr[0]++;
			}else if(s.charAt(c)!=s.charAt(i-1)) { //초기값과 그다음값이 다른경우 비교할 값 증가.
				arr[1]++;
			}
			if(arr[0]==arr[1]) { //0번째와 1번째가 같으면 카운트 값 증가한 후 arr배열을 0 으로 초기화
				answer++;
				arr[0]=0;
				arr[1]=0;
			}else if(arr[0]!=arr[1]&&i==s.length()) { //0번째와 1번째가 다를경우와 i가 s의 길이랑 같을경우 카운트 값 증가.
				answer++;
			}
		}
        return answer;
    }
}
