package module.algos;

public class SubArrSum {
	
	public int maxSubArray(int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		int currSum, maxSum;
		currSum =  maxSum = nums[0];
		for(int i=1; i<nums.length; i++){
			currSum = Math.max(currSum+nums[i], nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}

}
