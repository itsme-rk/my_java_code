 
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,flag=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number to check");
		n=sc.nextInt();
			sc.close();
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println( "entered number is not prime " );
		}else {
			for(int i=2;i<m;i++)
			{if(n%i==0) {
				System.out.println("entered number is not a prime number");
				flag=1;
				break;
			}}if(flag==0)
			{
				System.out.println("entered number is a prime number");
			}
		

	}

}
}
