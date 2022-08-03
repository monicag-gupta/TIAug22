interface GF{
	void mercedes();
}
interface Pa extends GF{
	void BMW();
}
interface Ma extends GF{
	void Lamborghini();
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
	
}
public class InterafceEg {

	public static void main(String[] args) {
		Pa pa=new A();
		pa.mercedes();
		pa.BMW();
		Ma ma=new A();
		ma.mercedes();
		ma.Lamborghini();
		GF gf=new A();
		gf.mercedes();
		A Ashutosh = new A();
		Ashutosh.mercedes();
		Ashutosh.Lamborghini();
		Ashutosh.BMW();
	}

}
