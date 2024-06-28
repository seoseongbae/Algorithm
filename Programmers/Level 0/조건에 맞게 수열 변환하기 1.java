class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<50){ //값이 50보다 작을경우
                if(arr[i]%2!=0){
                    answer[i]=arr[i]*2;
                }else{
                    answer[i]=arr[i];
                }
            }else{ //값이 50보다 클경우
                if(arr[i]%2==0){
                    answer[i]=arr[i]/2;
                }else{
                    answer[i]=arr[i];
                }
            }
        }
        return answer;
    }
}
