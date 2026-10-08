class Solution {
   public int largestRectangleArea(int[] heights) {
       int n = heights.length;


       // Array to store the index of the nearest smaller element to the left
       int[] leftMin = new int[n];
       leftMin[0] = -1; // No smaller element on the left for the first bar


       Stack<Integer> leftStack = new Stack<>();
       leftStack.push(0);


       // Fill leftMin array
       for (int i = 1; i < n; i++) {
           // Pop elements until we find a smaller element
           while (!leftStack.isEmpty() && heights[leftStack.peek()] >= heights[i]) {
               leftStack.pop();
           }


           // Assign nearest smaller element index to the left
           leftMin[i] = leftStack.isEmpty() ? -1 : leftStack.peek();
           leftStack.push(i);
       }


       // Array to store the index of the nearest smaller element to the right
       int[] rightMin = new int[n];
       rightMin[n - 1] = n; // No smaller element on the right for the last bar


       Stack<Integer> rightStack = new Stack<>();
       rightStack.push(n - 1);


       // Fill rightMin array
       for (int i = n - 2; i >= 0; i--) {
           // Pop elements until we find a smaller element
           while (!rightStack.isEmpty() && heights[rightStack.peek()] >= heights[i]) {
               rightStack.pop();
           }


           // Assign nearest smaller element index to the right
           rightMin[i] = rightStack.isEmpty() ? n : rightStack.peek();
           rightStack.push(i);
       }


       // Calculate the maximum area
       int maxArea = 0;
       for (int i = 0; i < n; i++) {
           int width = (rightMin[i] - leftMin[i]) - 1;
           int area = width * heights[i];
           maxArea = Math.max(maxArea, area);
       }


       return maxArea;
   }
}




