package com.class11;

public class TaskLargestNum {
	public static void main(String[]args) {
		int[] nums= {2,20,22,500,200,13};
		
		int largest=nums[0];
			for(int i=0; i<nums.length; i++) {
				if(nums[i]>largest) {
					largest=nums[i];
				}
				
			}
	
		System.out.println("The largest number is "+largest);
		
	}
	
	
	

}
