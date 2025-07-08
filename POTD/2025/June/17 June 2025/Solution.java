import java.util.* ;
import java.io.*; 
public class Solution {
	public static char firstNonRepeating(String str) {
		// Write your code here
		HashMap<Character, Integer> map = new HashMap<>();
		int n=str.length();

		for(int i=0; i<n; i++){
			char ch=str.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
		}

		for(int i=0; i<n; i++){
			char ch=str.charAt(i);

			if(map.get(ch)==1){
				return ch;
			}
		}

		return '#';
	}
}
