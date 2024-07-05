class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        if(arr.length>arr[0].length){ //행이 클경우
            answer = new int[arr.length][arr.length];
        }else if(arr.length<arr[0].length){//열이 클경우
            answer= new int[arr[0].length][arr[0].length];
        }else{//같을경우
            answer = new int[arr.length][arr.length];
        }
       for(int i=0;i<arr.length;i++){
    	   System.arraycopy(arr[i],0,answer[i],0,arr[0].length);//배열은0으로 초기화되기 때문에 그값을 arraycopy를 이용하여 복사
       }
        
        return answer;
    }
}
