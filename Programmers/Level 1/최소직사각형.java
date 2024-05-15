class Solution {
    public int solution(int[][] sizes) {
        int max1=0,max2=0;
        for(int i=0;i<sizes.length;i++)
        {
            if(sizes[i][0]<sizes[i][1])
            {   
                int tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
            if(max1<sizes[i][0])max1=sizes[i][0];
            if(max2<sizes[i][1])max2=sizes[i][1];
        }
        return max1*max2;
    }
}
---------------------------------------------------------------
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp=0;
        for(int i=0;i<sizes.length;i++) {	// 가로 세로 비교해서 큰값은 가로로 몰아넣기.
        	for(int j=0;j<sizes[i].length-1;j++) {
        		if(sizes[i][j]<sizes[i][j+1]) {	//번호별 가로값과 세로값 확인하여 가로쪽으로 큰값 넘기기
        			temp=sizes[i][j+1];
        			sizes[i][j+1]=sizes[i][j];
        			sizes[i][j]=temp;
        		}
        	}
        }
        int wmax=sizes[0][0]; //가로값중 가장 큰 값 담을 변수
        int hmax=sizes[0][1]; //세로값중 가장 큰 값 담을 변수
        for(int i=0;i<sizes.length;i++){ 
            if(sizes[i][0]>wmax) { // 가로값중 큰값 구하기
            	wmax=sizes[i][0];
            }
            if(sizes[i][1]>hmax) { // 세로값중 가장 큰값 구하기
            	hmax=sizes[i][1];
            }
        }
        answer=wmax*hmax;
        return answer;
    }
}
