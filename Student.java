//Code by Abhishek Jain
public class Student {
	private int stdId;
	private int fees;
	private String stdName;
	private String course;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		if(stdId<100){
			System.out.println("The stdId cannot be less than 100");
			stdId=100;
		}
		this.stdId = stdId;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		if(fees<=0){
			System.out.println("Fees was -ve or 0, so fine of 200/- is to be paid");
			fees=200;
		}
		this.fees = fees;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	void print(){
		System.out.println("Details: id is "+stdId+" name "+ 
	stdName+" course enrolled in " +course+" fees is "+fees);
	}
	void input(int id, String name, String c,int f){
		setStdId(id);
		setStdName(name);
		setCourse(c);
		setFees(f);
		print();
	}
	public String toString(){
		return "The Student details are: id is "+stdId+" name "+ 
				stdName+" course enrolled in " +course+" fees is "+fees;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.input(45, "Abhishek", "Java", -30);
		s1.print();
		System.out.println(s1);

	}

}
