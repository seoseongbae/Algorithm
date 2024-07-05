class Solution {
    public int solution(String[] strArr) {

    int[] arr=new int[31]; //길이가 30까지있으면 30까지의 크기를 지정
		for(int i=0;i<strArr.length;i++){ 
            arr[strArr[i].length()]++; //strArr안에 문자열의 길이에 따라 arr배열에 +1
        }
        int answer=arr[0];
        for(int i=0;i<arr.length;i++){
            if(answer<arr[i]){
                answer=arr[i];
            }
        }
        return answer;
    }
}
