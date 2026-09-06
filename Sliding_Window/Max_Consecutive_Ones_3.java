package Sliding_Window;
/*
    Problem Statement: Max_Consecutive_Ones_3 

    Use: Ued sliding window
	we create a window of fixed sized or variable too but not here ;

	&& then shift the window by shifting it
	shifting is donw by removing left element abnd adding right element;
	like FIFO rule.


    Time:  O(n)
    Space: O(1) // it uses fixed ammount of variables 

*/
class Max_Consecutive_Ones_3{
    public int longestOnes(int[] nums, int k) {
        int count = 0; // count == no. of zeroes
        int max = 0;
        int left = 0;

        for ( int right = 0 ; right < nums.length ; right ++ ) {
            
            if ( nums[right] == 0 ) 
                count++;

            while( count > k ) {
            
                if ( nums[left] == 0 )
                    count--;

                left++;

            }    

            max = Math.max(max, right - left +  1);

        }

        return max;
    }
}
