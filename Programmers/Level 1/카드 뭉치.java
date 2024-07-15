class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
       boolean chk=false; //그 순번대로 나왔는지 확인하기위한 boolean변수 선언.
		int count1=0;
		int count2=0;
		for(int i=0;i<goal.length;i++) { //goal안에있는 배열을 돌면서
			for(int j=0;j<cards1.length;j++) { //cards1배열 돌리며
				if(goal[i].equals(cards1[j])) { //goal과 cards1값이 같을 경우
					if(j==count1) { // j번째 인덱스와 count1값이 같을경우 true로 변경 count1 증가
						chk=true;
						count1++;						
					}else { //아닐경우 false로 변경후 포문 벗어남.
						chk=false;
						break;
					}
					
				}
			}
			for(int j=0;j<cards2.length;j++) { 
				if(goal[i].equals(cards2[j])) { //goal과 cards2값이 같을경우
					if(j==count2) { //j번째 인덱스와 count2값이 같을경우 true로 변경 후 count2증가
						chk=true;
						count2++;
					}else { //아닐경우 false로 변경후 break;
						chk=false;
						break;
					}
				}
			}
			if(!chk) { //false인 경우 포문을 완전 벗어나기 위해 조건문 설정.
				break;
			}
		}
		if(chk) {
			answer="Yes";
		}else {
			answer="No";
		}
        return answer;
    }
}
