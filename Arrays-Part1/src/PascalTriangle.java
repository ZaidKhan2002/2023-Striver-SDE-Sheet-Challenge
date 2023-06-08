import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currRow = new ArrayList<>();
            long ans = 1;
            for (int col = 0; col <= row; col++) {
                currRow.add((int) ans);
                ans = ans * (row - col) / (col + 1);
            }

            triangle.add(currRow);
        }

        return triangle;
    }
}
