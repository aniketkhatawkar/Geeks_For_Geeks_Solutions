class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int sz1 = arr.length;
        int sz2 = arr[0].length;
        
        Node HEAD = null;
        List<Node> heads = new ArrayList<>( sz1 );
        
        
        for ( int i=0; i<sz1; i++ ) {
            heads.add( null );
            Node t = null;
            for ( int j=0; j<sz2; j++ ) {
                Node t1 = new Node( arr[i][j] );
                
                if ( HEAD == null ) {
                    HEAD = t1 ;
                }
                if ( heads.get( i ) == null ) {
                    heads.set( i, t1 );
                }
                else {
                    t.right = t1;
                }
                t = t1;
            }
        }
        
        for ( int i=0; i<sz1-1; i++ ) {
            Node r1 = heads.get( i );
            Node r2 = heads.get( i+1 );
            while( r1 != null && r2 != null ) {
                r1.down = r2;
                r1 = r1.right;
                r2 = r2.right;
            }
        }
        return HEAD;
    }
}