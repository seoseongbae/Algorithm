import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
       String[] str= polynomial.split(" ");
		List list = new ArrayList();
		for(int i=0;i<str.length;i++) {
			 if(!str[i].contains("+")) {
				 list.add(str[i]);
			 }
		}
		int sum=0; //x항 값 더할공간
		int sum1=0; //일반항 더할 공간
		String x="";//x항 앞에 있는값 구할 변수
		String chk="";
		for(int i=0;i<list.size();i++) {
			chk=(String)list.get(i);
			if(!chk.contains("x")) { //x값이 존재하지 않는경우
				sum1+=Integer.parseInt((String) list.get(i));
			}
			if(chk.contains("x")) {
				x=(String)list.get(i); //x에 리스트i값 대입
				int a=x.indexOf("x");//a에 x변수에 x값이 어디있는지 확인
				x=x.substring(0,a);//x변수를 substring을 이용하여 앞값만 구함.
				if(x.length()==0) {
					sum+=1;
				}else {
					sum+=Integer.parseInt(x);
				}
			}
		}
		if(sum==0) { //x항이 없을 경우
			answer+=sum1;
		}else if(sum==1) {//x항이 있는데 1일경우
			if(sum1==0) {//상수항이 없을경우
				answer="x";
			}else {//상수항이 있을경우
				answer+="x + "+sum1;				
			}
		}else{ //x항이 값이 1보다 클경우
			if(sum1==0) {
				answer=sum+"x";			
			}else if(sum1!=0){
				answer=sum+"x + "+sum1;
			}
		}
        return answer;
    }
}
