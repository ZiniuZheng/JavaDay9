package Static;

public class MyArraysDemo {

	public static void main(String[] args) {
		//MyArrays m = new MyArrays();
		int[] arr = {3,5,8,10,1};
		int max = MyArrays.getMax(arr);
		System.out.println(max);
		
		int index = MyArrays.getIndex(arr, 8);
		System.out.println(index);

	}

}
