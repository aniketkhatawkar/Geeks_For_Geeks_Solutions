import java.util.* ;
import java.io.*; 
public class Solution {
    public static long countOfNumbers(long n) {
		// Write your code here.
		Queue<Long> queue = new LinkedList<>();

		queue.add(1L);
		int count=0;

		while(!queue.isEmpty()){
			long curr=queue.poll();
			if(curr>n){
				break;
			}

			count++;
			queue.add(curr*10);
			queue.add(curr*10+1);
		}

		return count;
	}
}