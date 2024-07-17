//약수의 갯수를 일일이 다 계산을 하게 되면 시간초과가 뜨기 때문에.
//수의 반을 나눠 그것에 대한 약수의 갯수를 구하도록 구현하였다.
class Solution {
    public int solution(int number, int limit, int power) {
       int answer=0;
		int[] arr=new int[number];
		int count1=0;
		for(int i=1;i<=arr.length;i++) {
			int count=1;
			for(int j=1;j<=i/2;j++) { 
				if(i%j==0) {
					count++;
				}
			}
			if(count>limit) {
				arr[count1++]=power;
			}else {				
				arr[count1++]=count;
			}
			count=0;
		}
		for(int i=0;i<arr.length;i++) {
			answer+=arr[i];
		}
        return answer;
    }
}
