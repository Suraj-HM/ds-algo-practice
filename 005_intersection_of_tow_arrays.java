import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums1) {
            map1.put(num, map1.containsKey(num) ? map1.get(num) + 1 : 1);
            set.add(num);
        }
        for (int num : nums2) {
            map2.put(num, map2.containsKey(num) ? map2.get(num) + 1 : 1);
            set.add(num);
        }

        List<Integer> al = new ArrayList<Integer>();
        for (int num : set) {
            if (map1.containsKey(num) && map2.containsKey(num)) {
                for (int i = 0; i < Math.min(map1.get(num), map2.get(num)); i++) {
                    al.add(num);
                }
            }
        }
        int[] res = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            res[i] = al.get(i);
        }
        return res;
    }
}