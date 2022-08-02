interface OS{ //100% abstraction
	void cmdLine(); 
	void dir();
	void FS();
}
class WinOS implements OS{
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
class MacOS implements OS{
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
