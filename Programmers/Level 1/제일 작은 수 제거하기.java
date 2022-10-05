class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length<=1)
        {
            int[] answer={-1};
            return answer;
        }
        int[] answer=new int[arr.length-1];
        int min=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                 min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=min)
            {
                answer[count]=arr[i];
                count++;
            }
        }
        
        
    return answer;
    }
}
