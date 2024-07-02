import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int [] arr= {a,b,c,d};
		Arrays.sort(arr);
		a=arr[0]; b=arr[1]; c=arr[2]; d=arr[3];
		return
				a==d ? 1111*a: //모두 같을떄
				a==c ? (int)Math.pow((10*a+d),2): //3개가 같을경우
				b==d ? (int)Math.pow((10*b+a),2): //3개가 같을경우
				a==b&&c==d ? (a+c)*Math.abs(a-c): //두개씩 같을경우
				a==b ? c*d: //두개만 같을 경우
				b==c ? a*d: //두개만 같을 경우
				c==d ? a*b: //두개만 같을 경우
				a; //다 다를경우
    }
}
