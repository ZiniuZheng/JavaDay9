package Static;

public class MathDemo {

	public static void main(String[] args) {
		//Math:包含了一些基本的数学运算方法
		//static double PI;
		System.out.println(Math.PI);
		
		//static double abs(double a): 返回绝对值
		System.out.println(Math.abs(15.67));
		System.out.println(Math.abs(-0.10));
		
		//static double ceil(double a) 天花板   向上取整
		System.out.println(Math.ceil(-2.1));
		System.out.println(Math.ceil(1.6));
		//static double floor(double a) 地板   向下取整
		System.out.println(Math.floor(1.2));
		System.out.println(Math.floor(-1.6));
		
		//static long round(double a): 四舍五入
		System.out.println(Math.round(-1.2));
		System.out.println(Math.round(1.6));
		
		//static double max(double a, double b)
		System.out.println(Math.max(3, 4));
		
		//static double pow(double a, double b):返回第一个参数的第二个参数次幂
		System.out.println(Math.pow(3, 4));
		
		//static double random():返回一个随机数，大于零且小于一
		System.out.println(Math.random());

	}

}
