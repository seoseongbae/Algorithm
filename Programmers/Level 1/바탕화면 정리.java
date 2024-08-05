class Solution {
    public int[] solution(String[] wallpaper) {
        int rdx = Integer.MIN_VALUE; //최대 x
        int rdy = Integer.MIN_VALUE; //최대 y
        int lux = Integer.MAX_VALUE; //최소 x
        int luy = Integer.MAX_VALUE; //최소 y
        for(int i=0;i<wallpaper.length;i++) {
        	for(int j=0;j<wallpaper[i].length();j++) {
        			if(wallpaper[i].charAt(j)=='#') {
        				rdx = Math.max(rdx, i);
        				rdy = Math.max(rdy, j);
        				lux = Math.min(lux, i);
        				luy = Math.min(luy, j);
        			}
        	}
        }
        int []answer= {lux,luy,rdx+1,rdy+1};
        return answer;
    }
}
