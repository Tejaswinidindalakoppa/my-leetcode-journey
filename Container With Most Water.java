class Solution { //O(n)
    public int maxArea(int[] height) {
        int n=height.length;
        int leftPointer=0;
        int rightPointer=n-1;

        int maxCapacity=Integer.MIN_VALUE;

        while(leftPointer<=rightPointer){
            int width=rightPointer-leftPointer;
            int lambai=Math.min(height[leftPointer],height[rightPointer]);
            int capacity=width*lambai;
            if(capacity>maxCapacity){
                maxCapacity=capacity;
            }

            if(height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }
            else{
                // height[leftpointer]>height[rightpointer]
                rightPointer--;
            }
        }
        return maxCapacity;
        
    }
} 
/*
this is the brute force approach with O(n^2)

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        if(n<=1){
            return 0;
        }

        int maximum_capacity= 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int width=j-i;
                int Height= Math.min(height[i],height[j]);
                int capacity=width*Height;
                if(capacity>maximum_capacity){
                         maximum_capacity=capacity;
                         }
                    
                }
            }
            return maximum_capacity;
        }
}
*/ 