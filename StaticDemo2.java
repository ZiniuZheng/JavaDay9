package Static;
/*
 * static的注意事项：
 * 			静态方法：
 * 				1、可以调用静态的成员变量
 * 				2、可以调用静态的成员方法
 * 				3、不可以调用非静态成员变量
 * 				4、不可以调用非静态成员方法
 * 				静态方法只能调用静态的成员
 * 			非静态方法：
 * 				1、可以调用静态的成员变量
 * 				2、可以调用静态的成员方法
 * 				3、可以调用非静态的成员变量
 * 				4、可以调用非静态的成员方法
 * 
 * static的优缺点：
 * 			优点：
 * 				1、对对象的共享数据提供单独空间的存储，节省空间，没有必要每一个对象都存储一份
 * 				2、可以直接被类名调用，不用在堆内存创建对象
 * 			缺点：
 * 				1、访问出现局限性。（静态虽好，但只能访问静态）
 * 静态的方法中是否有this这个对象？没有的
 */
public class StaticDemo2 {

	public static void main(String[] args) {
		Student.graduateFrom = "湖南大学";
		//Student.study();
		Student s = new Student();
		s.eat();
	}

}

class Student{
	String name;
	int age;
	static String graduateFrom; //毕业院校
	
	public static void study() {
		//System.out.println(graduateFrom);
		//sleep();
		
		//System.out.println(name);
		
		//eat();
	}
	
	public static void sleep() {
		System.out.println("sleep");
	}
	
	public void eat() {
		System.out.println("eat");
		
		System.out.println(graduateFrom);
		sleep();
	}
}
