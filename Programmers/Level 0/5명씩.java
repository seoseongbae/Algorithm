class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        if(names.length%5!=0) { //5의 배수가 아닌경우 나머지에+1값으로 answer배열 선언
			answer= new String[names.length/5+1];
		}else { //5의 배수일 경우 5를 나눈값으로 answer배열 선언
			answer=new String[names.length/5];
		}
		int count=0;
        for(int i=0;i<names.length;i+=5){//0부터 5씩 증가하면서 i번째 있는 배열만 answer배열에 추가 
                answer[count++]=names[i];
        }
        return answer;
    }
}
