/* 문제 
선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요. */

import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
	        int max=sides[0]+sides[1];
	        int min=sides[1]-sides[0];
	        for(int i=sides[1]+1;i<max;i++)//한변이 가장 긴 경우
	        {
	            answer++;
	            
	        }
	        for(int i=min+1;i<=sides[1];i++)//주어진 sides[1]값이 가장 큰 경우
	        {
	            answer++;
	        }
        return answer;
    }
}
