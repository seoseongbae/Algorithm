class Solution {
    public int solution(int[] arr, int idx) {
        int answer=0;
		for(int i=0;i<arr.length;i++){
            if(arr[i]==1&&i>=idx){ //arr[i]가 1이면서 i값이 idx보다 크거나 같을경우
                answer=i;
                break;
            }else{
                answer=-1;
            }
        }
        return answer;
    }
}
