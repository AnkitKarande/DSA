class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();// to store answer
        if(root==null) 
            return list;
        
        List<Integer> cur = new ArrayList<>();// to store current level node
        
        Queue<Node> Mq = new LinkedList<>();// Main queue for root 
        Queue<Node> Cq = new LinkedList<>();// child queue for child 
        Mq.add(root);
        
        while(!Mq.isEmpty()){
            Node node = Mq.remove();
            cur.add(node.val);// adding node to current level
            // adding all children to child queue
            for(Node child:node.children){
                Cq.add(child);
            }
            // if main queue is empty that means we have traverse all parent node
            if(Mq.isEmpty()){
                Mq = Cq;
                Cq = new LinkedList<>();
                list.add(cur);
                cur = new ArrayList<>();
            }
        }
        return list;
    }
}
// TC : O(N)
// SC : O(N)
