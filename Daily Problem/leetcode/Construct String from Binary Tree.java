class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder sb = solve(root,new StringBuilder());
        return sb.toString();
    }
  
    static StringBuilder solve(TreeNode root,StringBuilder sb){
        if(root==null) return sb; // root is null return the sb because leaf node;
        //adding root's value to the answer
        sb.append(root.val);
        
        //adding the left child's value is not null
        if(root.left!=null){
            sb.append("(");
            solve(root.left,sb);
            sb.append(")");
        }
        
        //adding empty paranthesis if left is null but root has right child
        if(root.left==null && root.right!=null){
            sb.append("()");
        }
        
        //adding right child's value
        if(root.right!=null){
            sb.append("(");
            solve(root.right,sb);
            sb.append(")");
        }
        return sb;
    }
}
// TC : O(N)
// SC : O(1) - used stringbuilder though
