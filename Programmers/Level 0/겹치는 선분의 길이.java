class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int count[] = new int[201];
        
        for(int i=0;i<lines.length;i++){
            int start = lines[i][0]+100; //음수를 해결하기위해 +100을 하여 범위를 0부터 200으로 처리 한다
            int end = lines[i][1]+100;
            
            for(int j=start;j<end;j++){
                count[j]+=1;
            }
        }
        
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                answer++;
            }
        }
        
        
        return answer;
    }
}
