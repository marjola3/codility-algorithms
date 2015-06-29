package pl.mpolak.codility_algorithms.tape_equilibrium;

/**
 * Created by Mariola on 2015-06-29.
 */
public class Runner {

    public static void main(String[] args) {
        TapeEquilibrium tape = new TapeEquilibrium();
        int solution = tape.solution(new int[]{3,1,2,4,3});
        System.out.println("Solution = " + solution);
    }

}
