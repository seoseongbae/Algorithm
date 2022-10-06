class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] bool=new boolean[10];
        for(int i=0;i<bool.length;i++)
        {
            bool[i]=false;    
        }
        for(int i=0;i<numbers.length;i++)
        {
            bool[numbers[i]]=true;    
        }
        for(int i=0;i<bool.length;i++)
        {
            if(bool[i]==false)
            {
                answer+=i;    
            }
        }
        return answer;
    }
}
