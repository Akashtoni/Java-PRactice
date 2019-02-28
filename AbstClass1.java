
public abstract class AbstClass1 {
	int empno;
	String name,address;
	public AbstClass1(int empno, String name, String address) 
	{
		this.empno = empno;
		this.name = name;
		this.address = address;	
	}
	abstract void details();

}
