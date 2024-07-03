class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length+1-n];//배열은 0 부터 시작함으로 길이는 길이의+1 -n을 해줘야 한다.
        int count=0;
        for(int i =n-1;i<num_list.length;i++){ //배열의 길이가 0 부터 시작이므로 초기값에 -1을 해줘야 한다.
            answer[count++]=num_list[i];
        }
        return answer;
    }
}
