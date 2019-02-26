import java.util.*;
public class T5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Armstrong : ");
		int a=sc.nextInt();
		int b=a, r,c=0;
		while(b>0) 
		{
			r=b%10;
			c=(r*r*r)+c;
			b=b/10;
		}
		if(c==a) 
		{
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("not a Armstrong Number");

	}

}
