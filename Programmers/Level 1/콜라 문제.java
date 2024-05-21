다시 푼 문제 n개중 a개당 b개씩 준다. 그러므로 n에a를 나눈값에 b를 곱해줘야 한다.
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
          if(n<a||n<2){
                break;
            }

            answer+=n/a*b;

            n=((n/a)*b)+(n%a);

        }
        return answer;
    }
}
