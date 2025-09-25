import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] arr = Arrays.stream(data).filter(x -> x[f(ext)] < val_ext).toArray(int[][]::new);
        int idx = f(sort_by);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                return i1[idx] - i2[idx];
            }
        });
        return arr;
    }
    public static int f(String s){
        if(s.equals("code")) return 0;
        if(s.equals("date")) return 1;
        if(s.equals("maximum")) return 2;
        if(s.equals("remain")) return 3;
        return 0;
    }
}