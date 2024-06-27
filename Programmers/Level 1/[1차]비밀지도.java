class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('0', ' ');
            answer[i] = answer[i].replace('1', '#');

            while (answer[i].length() != n) {
                answer[i] = ' ' + answer[i];
            }
        }
        return answer;
    }
}
----------------------------------------------------------------다시 풀어본 코드
    class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		String s1="",s2="",s3="",s4="",s5="";
		for(int i=0;i<n;i++) {
			s1=Long.toBinaryString(arr1[i]); //2진수 변환(n이 int형 크기보다 더 클경우를 생각하여 long타입 선언)
			s2=Long.toBinaryString(arr2[i]); //2진수 변환
			s3=String.valueOf(Long.parseLong(s1)+Long.parseLong(s2)); //변환한 수 두개 정수형으로 합침
			for(int j=0;j<s3.length();j++) { 
				if(s3.charAt(j)=='2') { // or 연산 합친값이 2인경우
					s4+='1'; //1로 대입
				}else {
					s4+=s3.charAt(j);
                }
			}
			answer[i]=s4;
			s4="";
		}
		for(int i=0;i<answer.length;i++) { //빈칸 공백 채워주려고 하는 for문
			String a=answer[i];
			if(answer[i].length()!=n){ //2진수 변환한 값의 길이가 n이랑 다를경우
				answer[i]="";
				for(int j=0;j<n-a.length();j++) {
					answer[i]+=" "; //그 차이값 만큼 공백 추가
				}
				answer[i]+=a;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(answer[i].charAt(j)=='1') {
					s5+="#";
				}else {
					s5+=" ";
				}
			}
			answer[i]=s5;
			s5="";
		}
        return answer;
    }
}
