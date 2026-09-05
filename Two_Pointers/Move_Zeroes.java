package Two_Pointers;
/*
    Problem Statement: Move Zeroes

    Use: Two Pointers
    Basically Two pointeras is Two definitons or two tasks.

    Time:  O(n)
    Space: O(1)

*/
class Move_Zeroes {
    public void moveZeroes(int[] nums) {
 	int left = 0 ; // stores the non zero number. 
	
	for ( int right = 0 ; right < nums.length ; right ++)
	// right scans the array elements
	    {
		if (nums[right] != 0)	
		// if nums[right=0] = 1.
		// if nums[right=1] = 0.
		// left = 0; right = 0 ; // THIS IS EXAMPLE AND INDEX NUMBER.
		// left = 0; right = 1; // THIS IS AGAIN INDEX.
		// here we check value of nums[right] 
		// that is whether the element is 0 or not.
		    {
			if (left != right)
			// left = 0 != right = 1
			// hence , swap left and right elements.
			//nums[left = 0] = 0;
			//nums[right = 1] = 1;
			    {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			    }
			left++; // here , now left gets incremented , left = 1;
            }
        }
    }
}