import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str=s.split(" ");
        int min,max,n;
        min=max=Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            n = Integer.parseInt(str[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }
        return min+" "+max;
    }
}
-----------------------------------------------------
//다른 풀이
    import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split(" ");
		int [] arr = new int[str.length];
		for(int i=0;i<str.length;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		answer = arr[0] + " " + arr[arr.length-1];
		
        return answer;
    }
}
