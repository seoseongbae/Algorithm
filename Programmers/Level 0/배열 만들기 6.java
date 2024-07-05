import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List list = new ArrayList();
        int i =0;
        while(i<arr.length){
            if(list.size()==0){ //리스트 사이즈가 0일경우
                list.add(arr[i]); //리스트에 arr[i]값 추가
                i++;
            }else{
                if((int)list.get(list.size()-1)==arr[i]){ //list.size()-1값과 arr[i]값이 같을경우
                		list.remove(list.size()-1);                	//list마지막값을 제거
                		i++;
                }else{ //list.size()-1값과 arr[i]값이 다를경우
                    list.add(arr[i]); //리스트에 arr[i]값 추가
                    i++;
                }
            }
        }
        if(list.size()==0) {
        	answer=new int[1];
        	answer[0]=-1;
        }else {
        	answer=new int[list.size()];
            for(int j =0;j<answer.length;j++){
                answer[j]=(int)list.get(j);
            }
        }
        return answer;
    }
}
