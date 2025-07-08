/* BST Node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */


class Solution {
    Node pre = null, suc = null;
    
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        findPreSucHelper(root, key);
        ArrayList<Node> result = new ArrayList<>();
        result.add(pre != null ? pre : null);
        result.add(suc != null ? suc : null);
        return result;
    }
    
    private void findPreSucHelper(Node root, int key){
        while(root != null){
            if(root.data == key){
                if(root.left != null){
                    Node temp = root.left;
                    while(temp.right != null){
                        temp = temp.right;
                    }
                    pre = temp;
                }
                if(root.right != null){
                    Node temp = root.right;
                    while(temp.left != null){
                        temp = temp.left;
                    }
                    suc = temp;
                }
                break;
            }else if(key < root.data){
                suc = root;
                root = root.left;
            }else{
                pre = root;
                root = root.right;
            }
        }
    }
}