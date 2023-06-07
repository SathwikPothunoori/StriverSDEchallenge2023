import java.io.*;
import java.util.*;

public class SetZeroes {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int index = 0; index < matrix.length; index++) {
            for (int i = 0; i < matrix[index].length; i++) {
                if (matrix[index][i] == 0) {
                    rows.add(index);
                    cols.add(i);
                }
            }

        }
        for (int index = 0; index < matrix.length; index++) {
            for (int i = 0; i < matrix[index].length; i++) {
                if (rows.contains(index) || cols.contains(i)) {
                    matrix[index][i] = 0;
                }
            }
        }
    }

}