package sorting;

class SortingAlgo{
	public void mergesort(int[] arr){
		int low = 0;
		int high = arr.length;
		
		int[] helper = new int[high];
		
		mergesort(arr, helper, low, high-1);
		
	}
	
	public void mergesort(int[] arr, int[] helper, int low, int high){
		if(low < high){
			int mid = (low + high)/2;
			mergesort(arr, helper, low, mid);
			mergesort(arr, helper, mid+1, high);
			merge(arr, helper, low, mid, high);
		}
	}
	
	public void merge(int[] arr, int[] helper, int low, int mid, int high){
		for(int i=low; i<=high; i++ ){
			helper[i] = arr[i];
		}
		
		int helpLeft = low;
		int helpRight = mid+1;
		int current = low;
		
		while(helpLeft <= mid && helpRight <= high){
			if(helper[helpLeft] <= helper[helpRight]){
				arr[current]=helper[helpLeft];
				helpLeft++;
			} else {
				arr[current] = helper[helpRight];
				helpRight++;
			}
			current++;
		}
		
		while(helpLeft<=mid){
			arr[current] = helper[helpLeft];
			current++;
			helpLeft++;
		}
		//No need for right half as it will be already there.
//		while(helpRight<=high){
//			arr[current] = helper[helpRight];
//			current++;
//			helpRight++;
//		}
		
	}
	
	public void quicksort(int[] arr){
		quicksort(arr, 0, arr.length-1);
	}
	
	public void quicksort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		
		if(left < index-1){
			quicksort(arr, left, index-1);
		}
		
		if(index < right){
			quicksort(arr, index, right);
		}
		
	}
	
	int partition(int[] arr,int left,int right){
		int pivot = arr[(left+right)/2];
		while(left<=right){
			while(arr[left] < pivot) left ++;
			while(arr[right] > pivot) right--;
			
			if(left<=right){
				swap(arr, left, right);
				left++;
				right--;
			}			
		}
		
		return left;
	}
	
	void swap(int[] arr, int left, int right){
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}
	
	
}

public class MySorting {
	
	public static void main(String[] args){
		int[] arr = {2,5,1,3,9,6};
		
		SortingAlgo s = new SortingAlgo();
		s.quicksort(arr);
		
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		
	}

}
