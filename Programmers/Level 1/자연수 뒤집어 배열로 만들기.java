class Solution {
    public int[] solution(long n) {
        long num=n;
        int count=0;
        
        while(num!=0) //배열의 길이를 구하기 위해서
        {
            num/=10;
            count++;
        }
        int[] answer=new int[count];
        count=0;
        num=n;
        while(num!=0)
        {
            answer[count]=(int)(num%10);
            num/=10;
            count++;
        }
            
        return answer;
    }
}
