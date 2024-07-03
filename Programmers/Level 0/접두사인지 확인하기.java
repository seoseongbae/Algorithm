class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            if(my_string.substring(0,i).equals(is_prefix)){ //substring으로 접두사가 is_prefix랑 같을경
                answer=1;
                break;
            }
        }
        return answer;
    }
}
