import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] num1={1,2,3,4,5};
        int[] num2={2,1,2,3,2,4,2,5};
        int[] num3={3,3,1,1,2,2,4,4,5,5};
        int[] count=new int[3];
        
        for(int i =0; i<answers.length; i++){
            if(num1[i%num1.length] == answers[i]) count[0]++;
            if(num2[i%num2.length] == answers[i]) count[1]++;
            if(num3[i%num3.length] == answers[i]) count[2]++;
        }
        
        int max = Math.max(count[0],Math.max(count[1],count[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==count[0]) list.add(1);
        if(max==count[1]) list.add(2);
        if(max==count[2]) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
---------------------------------------------------------------------------------
    import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1,2,3,4,5};
		int[] b = {2,1,2,3,2,4,2,5};
		int[] c = {3,3,1,1,2,2,4,4,5,5};
		int[] score = {0,0,0};
		for(int i=0;i<answers.length;i++) { //answers배열에 있는 값과 a,b,c있는 배열 비교 후 +1씩 증가
			if(answers[i]==a[i%a.length]) {
				score[0]++;
			}
			if(answers[i]==b[i%b.length]) {
				score[1]++;
			}
			if(answers[i]==c[i%c.length]) {
				score[2]++;
			}
		}
		int max = Math.max(score[0], Math.max(score[1], score[2])); //최대 점수 값 찾기
		
		// 최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) if(max == score[i]) answ.add(i+1);
        
        answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }
        return answer;
    }
}
