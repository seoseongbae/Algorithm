import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double [] arr= new double[N];
		for(int i=0;i<stages.length;i++) {
			if(stages[i]<=N) {
				arr[stages[i]-1]++;				
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<stages.length;j++) {
				if(stages[j]>=i+1) { //실패율을 구하기 위해 해당 값보다 크거나 같은 값을 구해줌.
					count++;
				}
			}
			if(count!=0) {
				arr[i]=arr[i]/(count*1.0);//소수점 계산을 위해 1.0을 곱하여 실수형태로 변환
				count=0;				
			}else {
				arr[i]=0;
			}
		}
		Map<Integer, Double> map = new HashMap<>();  //Map을 생성하여 스테이지와 실패율을 대입
		for(int i=0;i<answer.length;i++) {
			map.put(i+1, arr[i]);
		}
		List list = new ArrayList(map.keySet());
		Collections.sort(list,(o1,o2)->Double.compare(map.get(o2), map.get(o1))); //sort함수를 이용하여 내림차순 정렬
		for(int i=0;i<list.size();i++) {
			answer[i]=(int)list.get(i);
		}
        return answer;
    }
}
