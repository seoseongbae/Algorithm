class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        boolean chk=true; //arr[i][j]와 arr[j][i]이 같은지 확인하기위한 논리형 변수 선언
        for(int i =0;i<arr.length;i++){ //2차원 배열 선언
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=arr[j][i]){ //arr[i][j]값과arr[j][i]값이 다를경우
                    chk=false; //chk를 false로 변경하고 for문 벗어남.
                    break;
                }
            }
            if(!chk){ //chk가 false인경우 for문을 벗어나기위해 break실행
                break;
            }
        }
        if(chk){
            answer=1;
        }
        return answer;
    }
}
