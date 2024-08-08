class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
		int x=-1,y=-1;
		boolean chk = true; //지나가는데 X가 있는지 체크하기위한 boolean변수 생성
		for(int i=0;i<park.length;i++) //현재 위치 S를 찾는 함수
		{
            for(int j=0;j<park[i].length();j++)               
            {
                if(park[i].charAt(j)=='S') {
                	x=i;
                	y=j;
                	break;
                }
            }
            if(x!=-1&&y!=-1) {
            	break;
            }
        }
		for(int i=0;i<routes.length;i++) {
			 String[] routLen = routes[i].split(" ");
	         String rout = routLen[0];
	         int len = Integer.parseInt(routLen[1]);
	         if(rout.equals("E")) { //방향이 동쪽일경우
	        	 if(y+len<park[0].length()) {
	        		 for(int j=y;j<=y+len;j++) {
	        			 if(park[x].charAt(j)=='X') {
	        				 chk=false;
	        			 }
	        		 }
	        		 if(chk) {
	        			 y=y+len;	        			 
	        		 }
	        	 }
	         }else if(rout.equals("W")) {//방향이 서쪽일경우
	        	 if(y-len>=0) {
	        		 for(int j=y;j>=y-len;j--) {
	        			 if(park[x].charAt(j)=='X') {
	        				 chk=false;
	        			 }
	        		 }
	        		 if(chk) {
	        			 y=y-len;	        			 
	        		 }
	        	 }
	         }else if(rout.equals("N")) { //방향이 북쪽일겨우
	        	 if(x-len>=0) {
	        		 for(int j=x;j>=x-len;j--) {
	        			 if(park[j].charAt(y)=='X') {
	        				 chk=false;
	        			 }
	        		 }
	        		 if(chk) {
	        			 x=x-len;	        			 
	        		 }
	        	 }
	         }else if(rout.equals("S")) { //방향이 남쪽일경우
	        	 if(x+len<park.length) {
	        		 for(int j=x;j<=x+len;j++) {
	        			 if(park[j].charAt(y)=='X') {
	        				 chk = false;
	        			 }
	        		 }
	        		 if(chk) {
	        			 x=x+len;	        			 
	        		 }
	        	 }
	         }
	         chk=true;
		}
		answer[0]=x;
		answer[1]=y;
        return answer;
    }
}
