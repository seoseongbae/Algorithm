
class Solution {
    public int solution(String my_string) {
       int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(""); //숫자만 확인하여 숫자가 아닌것은 공백으로 변환
       String count="";
 
        for(int i=0;i<str.length;i++) {
        	
            if(!str[i].equals(" ")) { //공백이 아닌경우 숫자열이 한개가 아닌경우
        		count+=str[i];  // 값저장 ex) 123
        	}else if(str[i].equals(" ")&&count.length()>0){ //공백이면서 count길이가 0보다 큰경우
        		answer+=Integer.parseInt(count); //answer에 대입
        		count="";	//빈공간으로 초기화
        	}
        	if(i==str.length-1&&count.length()>0) {
        		answer+=Integer.parseInt(count);
        	}
        }
        return answer;
    }
}
