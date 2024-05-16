문자열을 첫글자부터 하나하나씩 늘려가며 lastIndexOf로 비교를 함.
문자 비교는 charAt()로 문자로 반환하여 비교.
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			int idx=s.substring(0,i).lastIndexOf(s.charAt(i));
			if(idx!=-1) {
				answer[i]=i-idx;
			}
			else {
				answer[i]=idx;
			}
		}
        return answer;
    }
}
