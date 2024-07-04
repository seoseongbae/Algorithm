class Solution {
    public String solution(String myString) {
        String answer = "";
		myString = myString.toLowerCase(); //전부 소문자로 바꿔줌.
		System.out.println(myString);
        for(int i=0;i<myString.length();i++){
           if(myString.charAt(i)=='a') { //문자열에 문자 하나를 뺴와 그 값이 a이면 대문자로 변경
        	   answer+="A";
           }else {
        	   answer+=myString.charAt(i);
           }
        }
        return answer;
    }
}
