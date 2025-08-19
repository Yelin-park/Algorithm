class Solution {
    public int[] solution(String[] wallpaper) {
        int H = wallpaper.length;
        int W = wallpaper[0].length();
        int minRow = H;
        int minCol = W;
        int maxRow = -1;
        int maxCol = -1;
        for (int r = 0; r < H; r++) {
            String row = wallpaper[r];
            for (int c = 0; c < W; c++) {
                if (row.charAt(c) == '#') {
                    if (r < minRow) {
                        minRow = r;
                    }
                    if (c < minCol) {
                        minCol = c;
                    }
                    if (r > maxRow) {
                        maxRow = r;
                    }
                    if (c > maxCol) {
                        maxCol = c;
                    }
                }
            }
        }
        return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
    }
}