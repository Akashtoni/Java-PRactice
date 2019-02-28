
public class AbstExt1 extends AbstClass1{
	int salary;
	public AbstExt1(int empno, String name, String address,int salary)
	{
	super(empno, name, address);
	this.salary=salary;	
}
	@Override
	void details() 
	{
	System.out.println("empno "+empno+" name is "+name+" address is "+address+" salary is "+salary);
		System.out.println("I work for Mphasis");		
}
	public static void main(String[] args) 
{
		AbstExt1 ob=new AbstExt1(301,"Akash","bangalore",50000);
			ob.details();	
}
}
