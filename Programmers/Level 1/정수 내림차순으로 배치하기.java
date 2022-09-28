import java.util.*;
import java.io.*;
class Solution {
    public long solution(long n) {
        long num=n;
        int count=0;
        String ans="";
        while(num!=0)
        {
            num/=10;
            count++;
        }
        int[] arr=new int[count];
        count=0;
        num=n;
        while(num!=0)
        {
            arr[count]=(int)(num%10);
            num/=10;
            count++;
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
            ans+=arr[i];
        }
        long answer=Long.parseLong(ans);
        return answer;
    }
}
