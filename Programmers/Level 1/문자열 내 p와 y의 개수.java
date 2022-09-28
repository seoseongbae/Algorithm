class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countp=0,county=0;
        String[] arr=s.split("");
       
        for(int i=0;i<arr.length;i++)
        {
            if("p".equals(arr[i])||"P".equals(arr[i]))
            {
                countp++;
            }
            else if("y".equals(arr[i])||"Y".equals(arr[i]))
            {
                county++;
            }
        
        }
        if(countp==county)
        {
            return answer;
        }
        else{
            answer=false;
            return answer;
        }
    }
}
