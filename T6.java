
public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=1,c;
		System.out.println("Fibonacci Series : " + i + " " + j);
		for(int a=1;a<=10;i++) 
		{
			c=i+j;
			System.out.print(" "+c);
			i=j;
			j=c;
		}

	}

}
