import java.util.*;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the multiplication table :");
		a=sc.nextInt();
				for(int i=a;i<=10;i++) 
				{
					for(int j=1;j<=10;j++) 
					{
						m=i*j;
						System.out.print(i+" x "+j +" = "+m +"||");
					}
					System.out.println("----------------------");
				}

	}

}
