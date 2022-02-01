import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTri = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            pascalsTri.add(new ArrayList<Integer>());
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    pascalsTri.get(i).add(1);
                } else {
                    pascalsTri.get(i).add(pascalsTri.get(i - 1).get(j - 1) + pascalsTri.get(i - 1).get(j));
                }
            }
        }
        return pascalsTri;
    }
}