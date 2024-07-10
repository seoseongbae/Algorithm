//common의 길이는 3부터 이므로 common배열의 0,1,2번째 방에있는 값으로 문제를 해결한다.
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
       int chk=0;
		if((common[1]-common[0])==(common[2]-common[1])) { //common[1]-common[0]값이 common[2]-common[1]값과 같을경
			chk=common[1]-common[0];
			answer=common[common.length-1]+chk;
		}else {  //common[1]-common[0]값이 common[2]-common[1]값이 다를경우
			chk=common[2]/common[1];
			answer=common[common.length-1]*chk;
		}
        return answer;
    }
}
