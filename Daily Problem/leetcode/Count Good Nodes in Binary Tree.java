class Solution {
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        return 1+goodNodes(root.left,root.val)+goodNodes(root.right,root.val);
    }
    public int goodNodes(TreeNode root,int max) {
        if(root==null) return 0;
        
        if(root.val>=max) return 1 + goodNodes(root.left,root.val) + goodNodes(root.right,root.val);// if current node val is greater than add it to ans;
        else return goodNodes(root.left,max) + goodNodes(root.right,max); // if not then call for it's child;
    }
}
