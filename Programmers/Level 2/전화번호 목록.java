import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) { //현재 값이 다음 값에 포함되어있는지 확인
                return false;
            }
        }
        
        return true;
    }
}
