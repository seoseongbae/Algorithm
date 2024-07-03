class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] str= my_string.split("");
        String temp="";
        int temp2=s;
        for(int j=e;j>=s;j--) {
        	 if(j-temp2==1) { //j-temp2가 1과 같을경우 temp2를 증가하지 않고 값 교환
       		  temp=str[temp2];
           	  str[temp2]=str[j];
           	  str[j]=temp;
           	  
       	  }else {  //같지 않을 경우
       		  if(j!=temp2) {  //j와 temp2의 값이 다를경우 temp2를 증가시키면서 값 교
           		  temp=str[temp2];
               	  str[temp2]=str[j];
               	  str[j]=temp;
               	  temp2++;
       		  }else {
       			  break;
       		  }
       		  
       	  }
        }
        for(int i =0;i<str.length;i++){
            answer+=str[i];
        }
        return answer;
    }
}
