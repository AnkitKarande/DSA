class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        while(head!=tail){
            if(head.data+tail.data>target){
                tail = tail.prev;
            }
            else if(head.data+tail.data<target){
                head = head.next;
            }else{
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(head.data);
                temp.add(tail.data);
                tail = tail.prev;
                ans.add(temp);
            }
        }
        return ans;
    }
}
// TC : O(N);
// SC : O(1);
