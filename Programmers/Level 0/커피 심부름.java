class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0;i<order.length;i++){
            if(order[i].contains("americano")) { //americano라는 문자열이 포함되어있는지 확인
            	answer+=4500;
            }else if(order[i].contains("cafelatte")){ //cafelatte라는 문자열이 포함되어있는지 확인
            	answer+=5000;
            }else {
            	answer+=4500;
            }
        }
        return answer;
    }
}
