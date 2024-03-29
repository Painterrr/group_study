/*
크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다.
->

그러한 수가 없는 경우에 오큰수는 -1이다.

예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.

https://www.acmicpc.net/problem/17298
 */
public class BOJ17298 {
    public static void main(String[] args) {

        int N = 4;
        int[] array = new int[N];
        array = new int[]{3,5,2,7};


//        int[] array = new int[]{3, 5, 2, 7};
        for(int i = 0; i<N; i++){
            for(int j = 1; j<N-1; j++){
                if(array[i] < array[i+1]){
                    array[i] = array[i+1];

            } else if(array[j] < array[j+1]){
                    array[i+1] = array[j+1];
                } else {
                    array[i] = -1;
                }
                if(array[j] < array[j+1]){
                    array[j] = array[j+1];
                } else {
                    array[j] = -1;
                }
    
            }
            System.out.println("array[i] = " + array[i]);
        }
    }
}
