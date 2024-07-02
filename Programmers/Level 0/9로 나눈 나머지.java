import java.util.*;
import java.math.BigInteger;
class Solution {
    public int solution(String number) {
       BigInteger a = new BigInteger(number); //number 값이 long형보다 더 크므로 BigInteger선언
		  a = a.mod(BigInteger.valueOf(9)); //BigInteger.valueOf : biginteger형으로 형변환
        int answer = a.intValue(); //BigInteger를 int형으로 형변환
        return answer;
    }
}
