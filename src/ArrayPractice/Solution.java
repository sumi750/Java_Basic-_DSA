package ArrayPractice;

import java.util.*;
    public class Solution {
        public List<Integer> modifyAndRearrangeArray(List<Integer> arr) {
            int l = 0;
            int r = 1;
            int n = arr.size();
            while (r < arr.size()) {
                if ((arr.get(l) != 0 && arr.get(r) != 0) && (arr.get(l) == arr.get(r))) {
                    arr.set(l, 2 * arr.get(l));
                    arr.set(r, 0);
                }
                l++;
                r++;
            }

            List<Integer> temp = new ArrayList<>(n);
            int j = 0;

            for(int i = 0; i < arr.size(); i++) {
                if (arr.get(i) != 0) {
                    temp.set(j, arr.get(i));
                    j++;
                }
            }

            arr.clear();
            for (int i = 0; i < n; i++) {
                arr.add(temp.get(i));
            }

            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                List<Integer> arr = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    arr.add(sc.nextInt());
                }

                Solution obj = new Solution();
                List<Integer> ans = obj.modifyAndRearrangeArray(arr);

                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

