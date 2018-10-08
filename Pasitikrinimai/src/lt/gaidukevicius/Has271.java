package lt.gaidukevicius;

public class Has271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeriai = {2, 7, -2, 4, 10, 2};
		System.out.println(has271(numeriai));
	}
	
	
	public static boolean has271(int[] nums) {
		  if(nums.length >= 3){
		    for(int i = 0; i < nums.length - 2; i++){
		      System.out.println(nums[i] + 5);
		    	if(nums[i+1] == nums[i] + 5 && (nums[i+2] == nums[i] - 1 || nums[i+2] == nums[i] - 1 - 1 ||
		    		nums[i+2] == nums[i] -1 - 2 || nums[i+2] == nums[i] -1 + 1 || nums[i+2] == nums[i] - 1 + 2)){
		        return true;
		      } 
		    }
		  }
		  return false;
		}


}
