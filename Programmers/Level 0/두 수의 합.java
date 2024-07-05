class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer=num1+num2;
        return answer;
        
    }
}

---------------------------------------------------
import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger c = new BigInteger(a);
		BigInteger d = new BigInteger(b);
		BigInteger max = c.add(d);
		String answer = max.toString();
        return answer;
    }
