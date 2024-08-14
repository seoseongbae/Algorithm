class Solution {
    public String solution(String s) {
        String answer = "";
        String str[]=s.split(" ");
        for(int i=0; i<str.length; i++) {
    		String now = str[i];
    		
    		if(str[i].length() == 0) {
    			answer += " ";
    		} 
    		else {
    			answer += now.substring(0, 1).toUpperCase();
    			answer += now.substring(1, now.length()).toLowerCase();
    			answer += " ";
    		}
    		
    	}
        if(s.substring(s.length() -1, s.length()).equals(" "))
        {
            return answer;
        }
        return answer.substring(0,answer.length()-1);
    }
}
----------------------------------------------------------------------
//다시 풀어본 문제
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(str[i].length()==0) {
				answer+=" ";
			}else {
				answer+=String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1).toLowerCase()+" ";
                //charAt으로 첫 문자를 가져와 대문자로 변경후 나머지는 소문자로 변경
			}	
		}
		if(s.substring(s.length()-1, s.length()).equals(" ")) {
			return answer;            
        }
        
        return answer.substring(0,answer.length()-1);
    }
}
