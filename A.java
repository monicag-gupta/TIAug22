class Pa{
	public void google(){
		System.out.println("Pa: Google Owner");
	}
	public void IBM(){
		System.out.println("Pa: IBM Owner");
	}
}
class MChild extends Pa{
	public void google(){
		System.out.println("MChild: Google and gmail Owner");
	}
	public void microsoft(){
		System.out.println("MChild : Microsoft Owner");
	}
}
class FChild extends Pa{
	public void google(){
		System.out.println("FChild: Google and Google+ Owner");
	}
	public void oracle(){
		System.out.println("FChild : Oracle Owner");
	}
}
class Framework{
	Pa p;
	public void input(Pa p){
		this.p=p;
	}
	public void print(){
		p.google();
		if(p instanceof MChild){
			MChild m=(MChild)p;
			m.microsoft();
		}
		if(p instanceof FChild){
			FChild m=(FChild)p;
			m.oracle();
		}
	}
	
}
public class A {	
	public static void main(String[] args) {
		MChild m1=new MChild();
		Framework f=new Framework();
		f.input(m1);
		f.print();
		f.input(new FChild());
		f.print();
		
	}
}
