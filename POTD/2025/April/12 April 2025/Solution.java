class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int row[] = {-1,0,1,0};
        int col[] = {0,-1,0,1};
        Queue<int []> pq = new LinkedList<>();
        pq.add(new int[]{sr,sc});
        int old = image[sr][sc];
        if(old==newColor)
        return image;
        image[sr][sc] = newColor;
        while(!pq.isEmpty())
        {
            int[] temp = pq.poll();
            for(int i = 0;i<4;i++)
            {
                int nr = temp[0]+row[i];
                int nc = temp[1]+col[i];
                if(nr>=0 && nc>=0 && nr<image.length && nc<image[0].length && image[nr][nc]==old)
                {
                    pq.add(new int[]{nr,nc});
                    image[nr][nc] = newColor;
                }
            }
        }
        return image;
    }
}