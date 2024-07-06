class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
		String str="";
		int count=0;
		for(int i=0;i<picture.length;i++) {
			for(int j=0;j<picture[i].length();j++) {
				for(int x=0;x<k;x++) {
					str+=picture[i].charAt(j);
				}
			}
			for(int x=0;x<k;x++) {
				answer[count++]=str;
			}
			str="";
		}
        return answer;
    }
}
