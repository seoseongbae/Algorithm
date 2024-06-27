class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0;i<my_strings.length;i++){
        	answer+=my_strings[i].substring(parts[i][0],parts[i][1]+1);//마지막 인덱스는 -1값 까지만 뽑으므로 +1해줘야함
                    
        }
        return answer;
    }
}
