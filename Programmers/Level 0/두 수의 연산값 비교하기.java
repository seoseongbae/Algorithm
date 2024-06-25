class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str=a+""+b;
        int max = 2*a*b;
        if(Integer.parseInt(str)>=max){//string형식으로 값을 붙여 정수형으로 형변환하여 비교
            answer=Integer.parseInt(str);
        }else{
            answer=max;
        }
        return answer;
    }
}
