package Static;
/*
 * static:是一个关键字，用于修饰成员变量和成员方法
 * static的特点：
 * 			被所有的对象所共享
 * 			可以使用类名调用
 * 			静态的加载优先于对象
 * 			随着类的加载而加载
 */
public class StaticDemo {

	public static void main(String[] args) {
		Person.graduateFrom = "湖南大学";
		
		Person p = new Person();
		p.name = "段誉";
		p.age = 18;
		//p.graduateFrom = "湖南大学";
		p.speak();
		
		Person p2 = new Person();
		p2.name = "萧峰";
		p2.age = 20;
		//p2.graduateFrom = "湖南大学";
		p2.speak();
		Person.think();
	}

}

class Person{
	String name;
	int age;
	static String graduateFrom; //毕业院校
	
	public void speak() {
		System.out.println(name + "---" + graduateFrom);
	}
	
	public static void think() {
		System.out.println("思考");
	}
}
