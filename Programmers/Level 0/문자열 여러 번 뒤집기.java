class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] str = my_string.split("");
        String temp2="";
        for(int i=0;i<queries.length;i++){
        	int temp = queries[i][0];
              for(int j=queries[i][1];j>=queries[i][0];j--) { //뒤에서 부터 탐색
            	  if(j-temp==1) { //queries[i][0]-queries[0][1]이 1이면 일반 변환
            		  temp2=str[temp];
                	  str[temp]=str[j];
                	  str[j]=temp2;
                	  
            	  }else { //queries[i][0]-queries[0][1]이 1이 아닐때
            		  if(j!=temp) { //j와 tempr값이 같이 않을때 뒤집은 후 temp값 증
                		  temp2=str[temp];
                    	  str[temp]=str[j];
                    	  str[j]=temp2;
                    	  temp++;
            		  }else {
            			  break;
            		  }
            		  
            	  }
            	  
              }
        }
        for(int i =0;i<str.length;i++){
            answer+=str[i];
        }
        return answer;
    }
}
