// working correctly till n=12, after that finding factorial will be interger overflow.
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ans.add(combination(rowIndex,i));
        }
        return ans;
    }
    public int combination(int r,int c){
        if(r==0 || c==0 || r==c) return 1;
        int numerator = factorial(r);
        int denominator = factorial(c)*factorial(r-c);
        return numerator/denominator;
    }
    public int factorial(int n){
        if(n==0 || n==1) return 1;
        return factorial(n-1)*n;
    }
}
//TC : O(n^4);
//SC : O(1);
