// 2차원배열인 queries안에 변경할 값들을 구해와 변경.
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i=0;i<queries.length;i++){
            int temp = arr[queries[i][0]];
            arr[queries[i][0]]=arr[queries[i][1]];
            arr[queries[i][1]]=temp;
        }
        answer=arr.clone();
        return answer;
    }
}
