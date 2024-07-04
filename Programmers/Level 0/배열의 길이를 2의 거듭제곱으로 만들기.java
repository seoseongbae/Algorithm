class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count=0;
        while(true){
            if(Math.pow(2,count)>=arr.length){ //거듭제곱 Math.pow함수를 이용하여 길이보다 클경우
                break; //while문을 벗어남
            }
            count++; //그것이 아닐경우 count++;
        }
        answer = new int[(int) Math.pow(2,count)]; answer범위는 거듭제곱만큼 크기를 지정해줌
        System.arraycopy(arr, 0, answer, 0, arr.length); //System.arraycopy를 이용하여 arr안에 있는 값을 복사하여 answer에 대입.
        return answer;
    }
}
