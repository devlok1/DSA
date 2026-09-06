package Sliding_Window;
/*
    Problem Statement: Max NumberOf Vowel in a Substring 

    Use: Ued sliding window
	we create a window of fixed sized or variable too but not here ;

	&& then shift the window by shifting it
	shifting is donw by removing left element abnd adding right element;
	like FIFO rule.


    Time:  O(n)
	Space: O(n) // it uses fixed ammount of variables 

*/
class Max_Number_Of_Vowel_in_a_Substring {
    public int maxVowels(String s, int k) {
        
        char[] a = s.toLowerCase().toCharArray();
        // k is laready defined so we use  
        // max to keep count of vowels
        // && coutn for window size.
        int count = 0;
        int max = 0;

        for(int i = 0 ; i < k ; i++ ) {
		    if (isVowel(a[i])) {
			    count++;
		    }
        }

	    max = count;

	    // now we slide the window by
	    // removing left element  
	    // & adding a new right element.
	    //
	
	    for (int right = k ; right < a.length ; right++){
		
		    // left element == right - k;		
		    if (isVowel(a[right - k])){
		    	count--; 
		    	// left element removed.
		    }
		    if (isVowel(a[right])){
		    	count++;  
		    	// right element added.
		    	// & size of window is constant.
		    }

		    max = Math.max(max, count);

	    }

	    return max;

    }


    private boolean isVowel(char c){
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

	}

}
