package Arrays;
/*
    Problem Statement: Reverse Word  of string 

    Use: 


    Time:  O(n)
    Space: O(1) // it uses fixed ammount of variables 

*/
class Reverse_Word_Of_String_Optimized {
    public String reverseWords(String s) {

        char[] a = s.toCharArray();

        int write = 0 ; // write for a character hence space = false.
        boolean space = false;

        for ( int read = 0 ; read < a.length ; read++ ) {
            
            if ( a[read] != ' ' ){
                a[write++] = a[read];
                space = false;
            }
            else if ( !space && write > 0) {
                a[write++] = ' ';
                space = true;
            }
        }

        int length = write;

        if ( length > 0 && a[length - 1 ] == ' ') {
            length--;
        }

        reverse( a , 0 , length - 1 );

        int start = 0;

        for (int end = 0 ; end <= length ; end++){
            if ( end == length || a[end] == ' ') // a[end] == whitespace
            {
                reverse(a, start, end - 1);
                start = end + 1;

            }
        }

        return new String(a , 0 , length);
    
    }

    private void reverse(char[] a , int left , int right ){
        while( left < right ){
            char temp = a[left];
            a[left]  = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        // while can also be written as 
        // for ( ; left < right ; left++ , right--){}
        /*  we initialization as em0pty because it is already
            initialized in the private void reverse(char[] a , int left , right) 
            hence they wil be called as 
            left = 0 ; right = a.length - 1;
        */
    }
}