import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n-lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;
    }
}
------------------------------------------ 다시푼 코드
    import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] student = new int[n];
		    Arrays.fill(student, 1); //모든 번째에 1로 초기화
        
        for (int i = 0; i < lost.length; i++) { //잃어버린 lost배열에 있는 값 위치에 1씩 빼줌.
            student[lost[i] - 1] -= 1;
        }
        
        for (int i = 0; i < reserve.length; i++) {  //여유가 있는 학생 reserve 배열에 있는 값 위치에 1씩 더해줌.
            student[reserve[i] - 1] += 1;
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 2) {  //학생 배열에 값이 2이면서
                if (i - 1 >= 0 && student[i - 1] == 0) { // 0보다 크고 그 전값이 0이라면 +1해줌
                    student[i - 1] = 1;
                    student[i] = 1;
                } else if (i + 1 < student.length && student[i + 1] == 0) { //학생배열의 크기보다 작으면서 그 다음값이 0이라면 +1해줌
                    student[i + 1] = 1;
                    student[i] = 1;
                }
            }
        }
        
        for (int i = 0; i < student.length; i++) {
            if (student[i] >0) {
                answer++;
            }
        }
        return answer;
    }
}
