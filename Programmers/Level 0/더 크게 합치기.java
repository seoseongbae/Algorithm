class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = a+""+b;
        String str1 = b+""+a;
        int c=Integer.parseInt(str);//int형으로 변환
        int d=Integer.parseInt(str1);
        if(c<d){
            answer=d;
        }else{
            answer=c;
        }
        return answer;
    }
}
