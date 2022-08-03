//static members of a class:
//1. static block:
//   runs before any other call in a class, even before main()
//2. static fields:
//	 shared variables among all the objects of the class.
//   common variable of the class
//3. static methods:
//   working with static fields
//   can be called without declaring any object
//4. static class:
//   static inner class within another class
//   used to define static inner class members

class Abc{
	class A{  //class file generated is Abc$A
		public void iA(){
			System.out.println("iA() is a fn in A, the inner class of Abc");
		}
	}
	static class B{  //class file generated is Abc$B
		public static void isA(){ //inner static methods require the inner class to be static
			System.out.println("iA() is a fn in A, the inner class of Abc");
		}
		public void isB(){
			System.out.println("iA() is a fn in A, the inner class of Abc");
		}
	}
	public static int x;
	static{
		System.out.println("Run before any other call made for the class even constructors");
	}
	public static void fn(){
		System.out.println("Static fn in Abc");
	}
}
public class StaticEg {
	//static block: is executed only once
	static{
		System.out.println("Run before any other call, even before main()");
	}
	public static void main(String[] args) {
		System.out.println("Main() block");
//		Abc a1=new Abc();
//		Abc a2=new Abc();
		Abc.x=10;
		System.out.println(Abc.x);
		Abc.fn();
		Abc oa=new Abc();
		Abc.A ia=oa.new A();//normal inner class 
		ia.iA();
		Abc.B ib=new Abc.B(); //static inner class
		ib.isA();
		ib.isB();
		Abc.B.isA();
		

	}

}
