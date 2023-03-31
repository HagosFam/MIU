package dayTwo;

class Solution {
    public static int removeDuplicates(int[] nums) {
    int l = 0 ;
    for(int r= 1; r < nums.length; r++){
        if(nums[r] == nums[l]){
            continue;
        }
        nums[++l] = nums[r];
    }
    return l + 1;

}


    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
}