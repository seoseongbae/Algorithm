class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3]; //점수 계산을 위한 배열 선언
		int idx=0;
		for(int i=0;i<dartResult.length();i++) {
			if(dartResult.charAt(i)=='1'&&dartResult.charAt(i+1)=='0') { //10점 인지 확인하는 조건식 적용
				dart[idx++]=10;
				i++;
			}else if(dartResult.charAt(i)>='0'&&dartResult.charAt(i)<='9') { //0~9인 경우 dart배열에 대입.
				dart[idx++]=Integer.parseInt(String.valueOf(dartResult.charAt(i)));
			}else if(dartResult.charAt(i)=='S') { //s 일경우 1제곱 한 값을 넣어줌.
				dart[idx-1]=(int) Math.pow(dart[idx-1], 1);
			}else if(dartResult.charAt(i)=='D') { //d 일경우 2제곱 한 값을 넣어줌.
				dart[idx-1]=(int) Math.pow(dart[idx-1], 2);
			}else if(dartResult.charAt(i)=='T') {  //t 일경우 3제곱 한 값을 넣어줌.
				dart[idx-1]=(int) Math.pow(dart[idx-1], 3);
			}else if(dartResult.charAt(i)=='*') { //*일 경우 배열에 그 현재 idx값에 idx-1,idx-2 배열에 2를 곱해줌.
				dart[idx-1]=dart[idx-1]*2;
				if(idx-2>=0) {
					dart[idx-2]=dart[idx-2]*2;
				}
			}else if(dartResult.charAt(i)=='#') { //#일 경우 dart[idx-1] 값에 -1을 곱해줌.
				dart[idx-1]=dart[idx-1]*-1;
			}
		}
		answer= dart[0]+dart[1]+dart[2];
        return answer;
    }
}
