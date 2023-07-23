package quadratic;
import java.util.Scanner;
public class OOPS {

	public static void main(String[] args) {
		int a,b,c,d;
		double x1,x2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the values for a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		d=((b*b)-4*a*c);
		if(d==0)
		{
			x1=x2=(-b/(2*a));
			System.out.println("the roots are" +x1  +x2);
		}
		else if(d>0)
		{
			x1=(-b+Math.sqrt(d)/(2*a));
			x2=(-b-Math.sqrt(d)/(2*a));
			System.out.println("the roots are" +x1 +x2);
		}
		else {
			System.out.println("roots are imaginary");
			
		}

	}

}
