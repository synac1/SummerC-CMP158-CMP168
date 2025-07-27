// 1D Array
import java.util.Arrays;

public class Swapper {
	public static void swap2(int[] arr, int x, int y) {
		arr[x]=arr[x]+arr[y];
		arr[y]=arr[x]-arr[y];
		arr[x]=arr[x]-arr[y];
	}
	public static void swapLeft(int[] arr) {
		//5,7,9,3 if this is given
		//7,9,3,5 this should be the order
		int temp = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1]; 
		}
		arr[arr.length-1]=temp;
	}
	public static void swapLeftI(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			swap2(arr, i, i+1); 
		}
		arr[arr.length-1]=temp;
	}
	
	public static void main(String[] args) {
		int [] nums = {5, 7, 9, 3};
		System.out.println(Arrays.toString(nums));
		//swap2(nums, 1, 2);
		swapLeftI(nums);
		System.out.println(Arrays.toString(nums));
		
	}
}
