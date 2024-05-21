name배열에 있는 값 하나씩 불러와 photo에 있는 값 하나씩 비교하며, 그 값이 있으면
그 번지수를 yearning에 있는 번지수에 값을 더한다.
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int []answer=new int[photo.length];
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<photo.length;j++) {
				for(int k=0;k<photo[j].length;k++) {
					if(name[i].equals(photo[j][k])) {
						answer[j]+=yearning[i];
					}
				}
				continue;
			}
		}
        return answer;
    }
}
