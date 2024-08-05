class Solution
{
    static int low = Integer.MAX_VALUE;
    static int high = Integer.MIN_VALUE;
    
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        low = Integer.MAX_VALUE;
        high = Integer.MIN_VALUE;
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        rec(root,mp,0,0);
        
        for(int i = low;i <= high;i++){
            arr.add(mp.get(i).get(1));
        }
        
        return arr;
    }
    
    public static void rec(Node root,HashMap<Integer,List<Integer>> mp,int lvl,int pos){
        if(root == null)
            return;
            
        if(!mp.containsKey(pos) || mp.get(pos).get(0) <= lvl){
            mp.put(pos,Arrays.asList(lvl,root.data));
        }
        
        low = Math.min(low,pos);
        high = Math.max(high,pos);
        rec(root.left,mp,lvl + 1,pos - 1);
        rec(root.right,mp,lvl + 1,pos + 1);
    }
}