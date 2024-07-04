package Static;
/**
 * 数组工具类
 * @author zhengziniu
 *
 */
public class MyArrays {
	private MyArrays() {}
	
	/*
	 * 返回数组中最大的元素
	 */
	public static int getMax(int[] arr) {
		if(arr==null||arr.length==0) {
			return 0;
		}
		int max = arr[0]; //参照物
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i]; //替换参照物
			}
		}
		
		return max;
	}
	/*
	 * 返回数组中指定参数的索引
	 */
	
	public static int getIndex(int[] arr, int a) {
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == a) {
				return i;
			}
		}
		
		return -1; //如果查不到指定的参数，则返回-1
	}
}
