class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=gcd(n,m);
        answer[1]= (n*m)/answer[0];
        return answer;
    }
    public static int gcd(int n,int m)
    {
        if(m==0)
		{
			return n;
		}
		else {
			return gcd(m,n%m);
		}
    }
}
--------------------------------------------------
유클리드 호제법사용하여 작성.
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=gcd(n,m);
		answer[1]=n*m/answer[0];
        return answer;
    }
    static int gcd(int n,int m) {
		int r;
		while(m>0) {
			r=n%m;
			n=m;
			m=r;
		}
		return n;
		
	}
}
