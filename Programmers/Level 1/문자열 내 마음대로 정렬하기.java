import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> array = new ArrayList<String>();
            
        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(array);
        
        for (int i=0; i<array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }
        
        return answer;
    }
}
----------------------------------------------------------------
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
    
        Arrays.sort(strings);
        int count=0;
        for(char c='a';c<='z';c++){
            for(int j=0;j<strings.length;j++){
                if(strings[j].charAt(n)==c){
                    answer[count++]=strings[j];
                }
            }
        }
        return answer;
    }
}
