/*  
    Problem : Porduct Of Array Except Self   
    
    Idea:
    Use a prefix / postfix or left or right concept.
    Two pointer Concept.
    We multiple indexes left/ prefix of Index i ;
    and the same with indexes on right / postfix of INdex i.
    and then we multiple both.

    Time: O(n)
    Space: O(1)

    The Solution here is Simply a logic 
    and will not run without Main() method.

*/ 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int product = 1;
        // for left elements
        for (int i = 0 ; i < n ; i++){
            ans[i] = product;
            product *= nums[i];
        }

        product = 1;
        // for right elements
        for (int i = n - 1 ; i >= 0 ; i--){
            ans[i] *= product;
            product *= nums[i];
        }
        return ans;
    }
}
