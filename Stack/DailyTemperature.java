/*  
    Problem : Daily Temperature   
    
    Idea:
    Use a monotonic decreasing stack storing indices.
    When current temperature is greater than the temperature
    at the stack top, we found the next warmer day.

    Time: O(n)
    Space: O(n)

    The Solution here is Simply a logic 
    and will not run without Main() method.

*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[] = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();
        //boolean increasing = true;  --> This is used in Definition of monotonic stack. 
        //int count[0] = null ;
        
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!stack.isEmpty()  && 
            temperatures[i] > temperatures[stack.peek()]){
                int previous = stack.pop();
                answer[previous] = i - previous;

            }
            stack.push(i);
        }
        return answer;
    }
}