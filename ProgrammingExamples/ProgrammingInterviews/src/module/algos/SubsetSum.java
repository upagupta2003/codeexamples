package module.algos;

import java.util.*;

public class SubsetSum {
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 
		 Arrays.sort(nums);
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 
		 for(int i=0; i<nums.length-1; i++){
			 int a = nums[i];
			 int start = i+1;
			 int end = nums.length-1;
			 while(start < end){
				 int b = nums[start];
				 int c = nums[end];
				 if(a+b+c == 0){
					 List<Integer> res = new ArrayList<Integer>();
					 res.add(a);
					 res.add(b);
					 res.add(c);
					 result.add(res);
					 start++;
					 end--;
					 
					 while(start<end && nums[start] < nums[start-1]) start++;
					 while(start<end && nums[end] > nums[end+1]) end++;
				 } else if(a+b+c > 0) end = end - 1;
				 else start = start+1;
			 }
			 
		 }
		 
		 return new ArrayList<List<Integer>>(result);
	                
	 }
	 
	 
}
