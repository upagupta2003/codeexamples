package module.algos;

public class RotateArray {
	
	public static void rotate1(int[] arr, int order ){
		if(arr.length == 0 || order < 0){
			throw new IllegalArgumentException("Illegal Arguments");
		}
		
		if(order > arr.length){
			order = order % arr.length;
		}
		
		int[] result = new int[arr.length];
		// 1 2 3 4 5 6 7  , 3
		// 5 6 7 1 2 3 4
		int j = 0;
		for(int i=order; i<arr.length; i++){
			result[i] = arr[j];
			j++;
		}
	
		for(int i=0; i< order; i++){
			result[i] = arr[j];
			j++;
		}
		
		System.arraycopy( result, 0, arr, 0, arr.length );
	}
	
	public static void rotate2(int[] arr, int order){
		
		if(arr.length == 0 || order < 0){
			throw new IllegalArgumentException("Illegal Arguments");
		}
		
		if(order > arr.length){
			order = order % arr.length;
		}
		
		reverse(arr, 0, order);
		reverse(arr, order+1, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
	}
	
	public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) return;
		
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		rotate2(arr, 3);
		for(int i=0; i< arr.length; i++){
			System.out.print(arr[i]);
		}
		
	}
}
