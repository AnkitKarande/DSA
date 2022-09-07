class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> s = new Stack<>();
        int i=0,j=0; //pointers for ip & op array
        
        //iterating until op array is not achieved
        while(j<n){
            
            //push the element until we match ip and op elements
            while(i<n && (s.isEmpty() || s.peek()!=op[j])){
                s.push(ip[i]);
                i++;
            }
            
            //pop the elemet until the op & ip element match 
            while(i<=n && !s.isEmpty() && s.peek()==op[j]){
                s.pop();
                j++;
            }
            
            //when we can't construct the op from ip cause stack top element is differenet
            //and stack is not empty and we exceed ip array
            if(i==n && !s.isEmpty() && s.peek()!=op[j]) return 0;
        }
        return 1;
    }
}
// TC : O(N)
// SC : O(N)
