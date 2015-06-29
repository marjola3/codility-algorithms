package pl.mpolak.codility_algorithms.tape_equilibrium;

/**
 * Created by Mariola on 2015-06-29.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        int leftSum = 0;
        int rightSum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < A.length; i++) {
            leftSum += A[i - 1];
            rightSum = sum -leftSum;

            int substr = leftSum - rightSum;
            if(substr < 0) {
                substr = substr * -1;
            }

            if(substr < min) {
                min = substr;
            }

        }

        return min;
    }
}
