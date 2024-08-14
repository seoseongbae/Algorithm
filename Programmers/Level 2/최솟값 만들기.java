import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++)
        {
            answer+=A[i]*B[B.length-1-i];
        }
        return answer;
    }
}
-------------------------------------------------------
//다시푼 코드
import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
		List list = new ArrayList();
		for(int i=0;i<B.length;i++) {
			list.add(B[i]);
		}
		Collections.sort(list, Collections.reverseOrder()); //역순으로 정렬
		for(int i=0;i<A.length;i++) {
			answer +=A[i]*(int)list.get(i);
		}

        return answer;
    }
}
