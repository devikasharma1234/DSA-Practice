class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftprod[]=new int [nums.length];
        int prod=1;
        
        for(int i=0;i<nums.length;i++){
            leftprod[i]=prod;//first store
            prod=prod*nums[i];//then calculate product for next

        
        }
        prod=1;
        int rightprod=1;
        
    
        for(int i=nums.length-1;i>=0;i--){
            leftprod[i]=leftprod[i]*prod;
             prod=prod*nums[i];
            
        


        }



      return leftprod;  }
    }