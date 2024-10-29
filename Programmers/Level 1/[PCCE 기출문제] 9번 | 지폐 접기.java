class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true) {
			int wmax = Integer.MIN_VALUE;
	        int wmin = Integer.MAX_VALUE;
	        int bmax = Integer.MIN_VALUE;
	        int bmin = Integer.MAX_VALUE;
			for(int i=0;i<wallet.length;i++) {
				 if (wallet[i] < wmin) wmin = wallet[i];
		         if (wallet[i] > wmax) wmax = wallet[i];
		         if (bill[i] < bmin) bmin = bill[i];
		         if (bill[i] > bmax) bmax = bill[i];
			}
			if(bmin<=wmin && bmax<=wmax) {
				break;
			}
			if(bill[0]>bill[1]) {
				bill[0]=bill[0]/2;
			}else {
				bill[1]=bill[1]/2;
			}
			answer++;
		}
        return answer;
    }
}
