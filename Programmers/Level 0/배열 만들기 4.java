import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i =0;
        List list = new ArrayList();
		while (true) {
			if (i < arr.length) { //i 값이 arr길이보다 작을경우
				if (list.isEmpty()) { //list가 비어있다면 list에 추가
					list.add(arr[i]);
					i += 1;
				} else if (!list.isEmpty()) { //list가 비어있지 않다면
					if ((int) list.get(list.size() - 1) < arr[i]) { //list의 마지막 값이 arr[i]값보다 작을경우
						list.add(arr[i]);
						i += 1;
					} else if ((int) list.get(list.size() - 1) >= arr[i]) { //list의 마지막 값이 arr[i]값보다 클경우
						list.remove(list.size()-1);
					}
				}
			}else { //아닐경우 while문 벗어남
				break;
			}
		}
		stk = new int[list.size()];
		for (int j = 0; j < stk.length; j++) {
			stk[j] = (int) list.get(j);
		}
        
        return stk;
    }
}
