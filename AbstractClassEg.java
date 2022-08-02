abstract class OS{ //33% abstraction
	public abstract void cmdLine(); 
	public void dir(){
		System.out.println("Dir/folder System");
	}
	public void FS(){
		System.out.println("File System");
	}
	
}
class WinOS extends OS{
	public void cmdLine(){
		System.out.println("Cmd");
	}
}
class MacOS extends OS{
	public void cmdLine(){
		System.out.println("Terminal");
	}
}
public class AbstractClassEg {
	public void workingOS(OS os){
		os.cmdLine();
		os.dir();
		os.FS();
	}

	public static void main(String[] args) {
		
		new AbstractClassEg().workingOS(new WinOS());

	}

}
