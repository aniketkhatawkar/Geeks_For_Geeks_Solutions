class Solution {

	public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
	    // code here
	    int n=profit.length;
	    int jobs[][]=new int[n][2];
	    for(int i=0;i<n;i++) jobs[i]=new int[]{profit[i],deadline[i]};
	    
	    int maxDeadline=0;
	    for(int i:deadline) maxDeadline=Math.max(maxDeadline,i);
	    
	    int deadlines[]=new int[maxDeadline+1];
	    Arrays.fill(deadlines,-1);
	    
	    Arrays.sort(jobs,(a,b)->(b[0]-a[0]));
	    
	    int maxProfit=0, maxJobs=0;
	    for(int i=0;i<n;i++) {
		   if(deadlines[jobs[i][1]]==-1) {
			  maxProfit+=jobs[i][0];
			  maxJobs++;
			  deadlines[jobs[i][1]]=i;
		   }
		   else {
			  int j=jobs[i][1];
			  while(j>0 && deadlines[j]!=-1) j--;
			  if(j>0) {
				 maxProfit+=jobs[i][0];
				 maxJobs++;
				 deadlines[j]=i;
			  }
		   }
	    }
	    
	    return new ArrayList<>(Arrays.asList(maxJobs,maxProfit));
	}
 }