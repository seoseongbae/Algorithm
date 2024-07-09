class Solution {
    public int solution(String[] spell, String[] dic) {
        int count=0;
	   int answer=2;
	   for(int i=0;i<dic.length;i++) {
		   for(int j=0;j<spell.length;j++) {
			   if(dic[i].contains(spell[j])) { //dic배열안에 있는 값중 spell에 있는 단어가 존재한다면 count증가
				   count++;
			   }
		   }
			   if(count==spell.length) { //count 값이 spell의 길이랑 같다면 answer를 1로 대입.
				   answer=1;
			   }
			   System.out.println(count);
			   count=0;
	   }
        return answer;
    }
}
