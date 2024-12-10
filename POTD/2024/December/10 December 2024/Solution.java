class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int n=intervals.length;
        int m=intervals[0].length;
        Arrays.sort(intervals,new Comparator<int []>(){
            @Override
            public int compare(int a[],int b[])
            {
                return Integer.compare(a[0],b[0]);
            }
        });
        int l=intervals[0][0];
        int r=intervals[0][1];
        int ans=0;
        for(int i=1;i<n;i++)
        {
         
          if(r<=intervals[i][0])
          {
              l=Math.min(intervals[i][0],l);
              r=Math.max(intervals[i][1],r);
          }
          else
          {
              if(r>=intervals[i][1])
              {
                  l=intervals[i][0];
                  r=intervals[i][1];
              }
              ans++;
          }
        }
        return ans;
    }
}
