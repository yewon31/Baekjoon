import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        int index = -1;

        if (ext.equals("code")) index = 0;
        else if (ext.equals("date")) index = 1;
        else if (ext.equals("maximum")) index = 2;
        else index = 3;

        for (int i = 0; i < data.length; i++) {
            if (data[i][index] < val_ext) {
                int[] temp = new int[4];
                temp[0] = data[i][0];
                temp[1] = data[i][1];
                temp[2] = data[i][2];
                temp[3] = data[i][3];
                list.add(temp);
            }
        }

        final int sortIndex;
        if (sort_by.equals("code")) sortIndex = 0;
        else if (sort_by.equals("date")) sortIndex = 1;
        else if (sort_by.equals("maximum")) sortIndex = 2;
        else sortIndex = 3;

        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[sortIndex], o2[sortIndex]);
            }
        });

        int[][] result = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}