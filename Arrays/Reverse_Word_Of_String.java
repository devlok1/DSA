package Arrays;
/*
    Problem Statement: Reverse Word  of string 

    Use: 

    I used String.trim(); string.split("\\s+");
    \\s+ -->> regex for whitespace and tabs , newline ,etc.
    1st '\' for java string to be an escapee character,
    2nd '\s' for regex whitespace. and '+' means one or more Automata concept.
    we create a three way reference of arrays,
    by converting the string to array of words(sequence of characters.)

    Time:  O(n)
    Space: O(n)

*/
class Reverse_Word_Of_String {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");

        for (int i = 0 , j = words.length - 1; i < j ; i++ , j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        return String.join(" ", words);
    
    }
}