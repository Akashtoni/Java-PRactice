import java.util.*;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter 5 numbers : ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}

}
