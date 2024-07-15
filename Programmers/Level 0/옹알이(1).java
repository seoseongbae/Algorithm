class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str= {"aya","ye","woo","ma"};
		
		for(int i=0;i<babbling.length;i++) {
			for(int j=0;j<str.length;j++) {
				babbling[i]=babbling[i].replace(str[j], " "); //str안에 있는 값들을 공백으로 변환
			}
		}
		for(int i=0;i<babbling.length;i++) {
			if(babbling[i].trim().isEmpty()){ //trim으로 공백을 제거해준후 비어있는지 확인.
				answer++;
			}
		}
        return answer;
    }
}
