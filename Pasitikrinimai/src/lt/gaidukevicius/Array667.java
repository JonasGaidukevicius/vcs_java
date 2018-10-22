package lt.gaidukevicius;

public class Array667 {

	public static void main(String[] args) {
		int[] masyvas = {6, 7, 2, 6};
		System.out.println(array667(masyvas));

	}

	
	public static int array667(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length - 1; i++){
		    if(nums[i] == 6 && (nums[i] == nums[i+1] || nums[i]+1 == (nums[i+1]))){
		      count++;
		    }
		  }
		  return count;
		}

}
