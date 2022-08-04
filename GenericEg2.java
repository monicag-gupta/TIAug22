import java.util.Arrays;

class Emp1{
	Object empId;
	public String toString() {
		return "Emp1 Class Object with Id :" + empId;
	}
}
class Emp2<T>{
	T empId;
	public String toString() {
		return "Emp2 Class Object with Id :" + empId;
	}
}
class Class1{
	Object[] a=new Object[10];
	Class1(){
		
	}
	Class1(Object[] aa){
		a=aa;
	}
	
	public String toString() {
		String s=" ";
		for(int i=0;i<a.length;i++){
			s=s+a[i]+", ";
		}
		return "Class1 [a=" + s + "]";
	}
	
	
}
class Class2<T>{
	T a;
	Class2(){
		
	}
	Class2(T aa){
		
		a=aa;
	}
	
	public String toString() {
		String s=" " + a;
		
		return "Class1 [a=" + s + "]";
	}
	
	
}
public class GenericEg2 {
	static void project1(){
		//requires int empId
		Emp1 e1=new Emp1();
		e1.empId=101;
		e1.empId="101"; //by mistake
		Integer i=(Integer)e1.empId; //checks for any mistakes
		System.out.println(e1);
		//..
	}
	static void project2(){
		//requires String empId
		Emp1 e1=new Emp1();
		e1.empId="E101";
		String s=(String)e1.empId; //checks for any mistakes
		System.out.println(e1);
	}
	static void project3(){
		//requires int empId
		Emp2<Integer> e1=new Emp2<>();
		e1.empId=101;
		//e1.empId="101"; //no mistakes are possible
		Integer i=(Integer)e1.empId; //checks for any mistakes; not needed
		System.out.println(e1);
		//..
	}
	static void project4(){
		//requires String empId
		Emp2<String> e1=new Emp2<>();
		e1.empId="E101";
		//e1.empId=10.4;
		//String s=(String)e1.empId; //checks for any mistakes; not needed
		System.out.println(e1);
	}
	public static void main(String[] args) {
		Class1 c1=new Class1();
		c1.a[0]=100;
		c1.a[1]="Hello";
		
		//It cannot be guaranteed that the elements of array a of c1 is of same data type.
		//According to project requirement, user may want complete int array 
		//or may be Emp type array or may be String array
		//One thing is common requirement :
		//All elements of the array should be of same data type
		
		Class2<Integer[]> c2=new Class2<>();
		Integer[] a={1,2,3};
		c2.a=a;
		c2.a[0]=100;
		//c2.a[1]="Hello"; //mistake not allowed
		Class2<String[]> c3=new Class2<>();
		String[] as={"1","2","3"};
		c3.a=as;
		//c3.a[2]=10; //mistake not allowed
		c3.a[3]="abc";
		
		project3();
		project4();
	}
}
