class Solution {
    public static void swapp(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        int mid=0;
        while(mid<=j){
            
            if(nums[mid]==0){
                swapp(nums, mid, i);
                i++;
                mid++;
            }
            else if (nums[mid]==2){
                swapp(nums, mid, j);
                j--;
            }
            else{
                mid++;
            }
        }
    }
}