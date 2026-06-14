import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> ans = new ArrayList<>();

        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);

        for (int i = 0; i <= s.length() - p.length(); i++) {

            String sub = s.substring(i, i + p.length());

            char[] subArray = sub.toCharArray();
            Arrays.sort(subArray);

            if (Arrays.equals(pArray, subArray)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
