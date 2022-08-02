abstract class OS{ //100% abstraction
	public abstract void cmdLine(); 
	public  abstract void dir();
	public abstract void FS();
}
class WinOS extends OS{
	public void cmdLine(){
		System.out.println("Cmd");
	}
	public  void dir(){
		System.out.println("Dir System");
	}
	public void FS(){
		System.out.println("NTFS: File System");
	}
}
class MacOS extends OS{
	public void cmdLine(){
		System.out.println("Terminal");
	}
	public  void dir(){
		System.out.println("folder System");
	}
	public void FS(){
		System.out.println("Inode File System");
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
