interface GF{
	void mercedes();
	default void audi(){
		System.out.println("Audi by GF: default");
	}
}
interface Pa extends GF{
	void BMW();
	default void skoda(){
		System.out.println("skoda by Pa: default");
	}
}
interface Ma extends GF{
	void Lamborghini();
	default void skoda(){
		System.out.println("skoda by Ma: default");
	}
}

class A implements Pa, Ma{
	public void mercedes(){
		System.out.println("Mercedes Benz by A from GF, Pa, Ma");
	}
	public void BMW(){
		System.out.println("BMW by A from Pa");
	}
	public void Lamborghini(){
		System.out.println("Lamborghini by A from Ma");
	}
	public void skoda(){
		System.out.println("skoda by A: default from Pa, Ma");
	}
	
}
public class InterafceEg {

	public static void main(String[] args) {
		Pa pa=new A();
		pa.mercedes();
		pa.BMW();
		pa.audi();
		pa.skoda();
		Ma ma=new A();
		ma.mercedes();
		ma.Lamborghini();
		ma.audi();
		ma.skoda();
		GF gf=new A();
		gf.mercedes();
		gf.audi();
		A obja = new A();
		obja.mercedes();
		obja.Lamborghini();
		obja.BMW();
		obja.audi();
		obja.skoda();
	}

}
