class Solution {
    public int solution(int a, int b) {

    int bottom = b/gcd(a,b); 
		while(bottom !=1) { //bottom이 1이 아닐때까지
			if(bottom%2==0) bottom/=2; //2로나눴을 때 나머지가 0이면 bottom값을 2로 나눠줌
			else if(bottom%5==0) bottom/=5; //5로 나눴을 때 나머지가 0이면 bottom값을 5로 나눠줌.
			else return 2; //둘다 아니면 2를 반환
		}
        return 1;
    }
    //유클리드 호제법을 사용(b가 0이 될때 까지 재귀로 반복)
    static int gcd(int a,int b) { 
		if(b==0) {
			return a;
		}
		return gcd(b,(a%b));
	}
}
