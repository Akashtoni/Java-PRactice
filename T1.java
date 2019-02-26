import java.util.*;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b) 
		{
			System.out.println(a+" is greater then "+b);
		}
		else if(b>a) 
		{
			System.out.println(b+" is greater then "+a);
		}
		else
			System.out.println(a+" is equal to "+b);
	}

}
