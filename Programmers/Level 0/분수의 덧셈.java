class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max=0;
        int a=(numer1*denom2+numer2*denom1);
        int b=denom1*denom2;
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                max=i;    
            }
        }
        answer[0]=a/max;
        answer[1]=b/max;
        return answer;
    }
}
