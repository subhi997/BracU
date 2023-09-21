public class DesignSetA{
  public DesignSetA(){
  }
  public static int[] notAlone(int[]nums,int val){
    for(int i=1 ; i<nums.length-1 ; i++){
      if(nums[i]==val){        
        if(nums[i-1]!=val && nums[i+1]!=val){
          if(nums[i-1]>nums[i+1]){
            nums[i]=nums[i-1];
          }
          if(nums[i+1]>nums[i-1]){
            nums[i]=nums[i+1];
          }
        }
      }
    }
    return nums;
  }
}