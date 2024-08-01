import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int chk = 0, chk2 = 0;
		if (ext.equals("date")) {
			chk = 1;
		} else if (ext.equals("maximum")) {
			chk = 2;
		} else if (ext.equals("remain")) {
			chk = 3;
		}
		List list = new ArrayList();
		for (int i = 0; i < data.length; i++) {
			if (data[i][chk] < val_ext) {
				if (sort_by.equals("date")) {
					chk2 = 1;
				} else if (sort_by.equals("maximum")) {
					chk2 = 2;
				} else if (sort_by.equals("remain")) {
					chk2 = 3;
				}
				list.add(data[i][chk2]);
			}
		}
		Collections.sort(list);
		int count = 0;
		answer = new int[list.size()][data[0].length];

		for (int k = 0; k < list.size(); k++) {
			for (int i = 0; i < data.length; i++) {
				if (data[i][chk2] == (int) list.get(k)) {
					for (int j = 0; j < data[i].length; j++) {
						answer[count][j] = data[i][j];
					}
					count++;
					break;
				}
			}

		}
        return answer;
    }
}
