class Solution {
    Node cloneGraph(Node node) {
        // code here
        Set<Integer> visited = new HashSet<>();
        return clone(node, visited);
    }
    
    Node clone(Node node, Set<Integer> visited) {
        Node newNode = new Node(node.val);
        visited.add(node.val);
        
        for (Node neighbor: node.neighbors) {
            if (!visited.contains(neighbor.val)){
                newNode.neighbors.add(clone(neighbor, visited));
            }
        }
        
        return newNode;
    }
}