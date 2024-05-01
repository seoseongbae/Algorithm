//p의 범위가 18보다 작거나 같음으로 long으로 비교를 해줘야한다.
// 자릿수에 따라 비교를 해야하므로 subString으로 자리수를 맞춰준다.
class Solution {
    public int solution(String t, String p) {
        int answer=0;
		for(int i=0;i<=t.length()-p.length();i++)
		{
			if(Long.parseLong(p)>=Long.parseLong(t.substring(i,i+p.length())))
				answer++;
		}
        return answer;
    }
}
