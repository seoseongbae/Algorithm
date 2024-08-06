import java.util.*;
import java.text.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
       Map<String,Integer> map = new HashMap();
		for(int i=0;i<terms.length;i++) {
			map.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].replace(" ","").substring(1)));
		}
		List<Integer> expiredList = new ArrayList<>();
        //정규표현식 구분자
        String [] todayParts = today.split("\\.");
        
        int todayYear = Integer.parseInt(todayParts[0]); //현재년도
        int todayMonth = Integer.parseInt(todayParts[1]);//현재월
        int todayDay = Integer.parseInt(todayParts[2]);	//현재일
        
        for(int i =0; i <privacies.length; i++){
            String[] info = privacies[i].split(" ");//년월일만 뽑기
            String[] dateParts = info[0].split("\\.");	//년 월 일 따로 뽑기
            
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            int calcYear = year;
            int calcMonth = month + map.get(info[1]);	
            int calcDay = day;

            while (calcMonth > 12) {	//월이 12보다 클경우
                calcYear += 1;		//년도를 1올리고
                calcMonth -= 12;	//월을 12빼줌
            }

            if (calcYear < todayYear || (calcYear == todayYear && calcMonth < todayMonth) ||
            (calcYear == todayYear && calcMonth == todayMonth && calcDay <= todayDay))
             {
                expiredList.add(i + 1);
            }

        }
        
        int[] answer = new int[expiredList.size()];
        for(int i =0; i<expiredList.size(); i++){
            answer[i] = expiredList.get(i);
        }
        return answer;
    }
}
