class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list =  new ArrayList<>(); // to store the answer
        Queue<TreeNode> q = new LinkedList<>(); // main queue
        q.add(root);
        
        //main queue loop
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0,count = 0;
            Queue<TreeNode> temp = new LinkedList<>();// to store each level node
            
            // traversing in each level
            while(size-->0){
                TreeNode node = q.remove();
                sum+=node.val;
                count++;
                if(node.left!=null){
                    temp.add(node.left);
                }
                if(node.right!=null){
                    temp.add(node.right);
                }
            }
            q = temp;// assigning the level order queue to main queue
            list.add(sum/count);
        }
        return list;
    }
}
// TC : O(N);
// SC : O(L); - L : level node
