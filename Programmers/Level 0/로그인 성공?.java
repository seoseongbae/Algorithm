
조건 - id랑pw 같다면 login
     - id만 같고 pw는 틀리면 wrong pw
     - 둘다 다르면 fail.
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i=0;i<db.length;i++)
		{
			if(id_pw[0].equals(db[i][0])) { //id가 같을때
				if(id_pw[1].equals(db[i][1])) { //pw가 같을때
					answer="login";
				}else {
					answer="wrong pw";
				}
			}
			
		}
		if(answer=="") {
			answer="fail";
		}
        return answer;
    }
}
