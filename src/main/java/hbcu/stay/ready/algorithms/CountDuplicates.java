package hbcu.stay.ready.algorithms;

import java.util.Arrays;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){

        return (Integer) countDupObjects(input);
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){

        return (Integer) countDupObjects(input);
    }

    public Object countDupObjects(Object[] input) {
        Arrays.sort(input);
        Object currValue = null;
        int dups = 0;

        for(int n = 0; n < input.length-1; n++) {
            if(input[n] == input[n+1] && input[n] != currValue) {
                dups++;
                currValue = input[n];
            }
        }
        return dups;
    }
}
