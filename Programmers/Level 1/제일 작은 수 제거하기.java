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
-------------------------------------------------
다시 푼 코드
    class Solution {
    public int[] solution(int[] arr) {
       int[] answer;
		int min=arr[0];
		if(arr.length>1) {
			answer=new int[arr.length-1];
			for(int i=0;i<arr.length;i++)
			{
				if(min>arr[i]) {
					min=arr[i];
				}
			}
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==min) {
					continue;
				}
				else {
					answer[count++]=arr[i];
				}
			}	
		}else {
			answer=new int[1];
			answer[0]=-1;
		}
		
        return answer;
    }
}
