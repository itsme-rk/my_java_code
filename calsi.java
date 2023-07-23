package calculator;
public class calsi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char oper;
		double op1,op2,res;
		Scanner sc = new SCanner(System.in);
		System.out.println("Enter the operator:");
		oper=sc.next().charAt(0);
		System.out.println("Enter the operand 1");
		op1=sc.next();
		System.out.println("Enter the operand 2");
		op2=sc.next();
		switch(oper) {
		case '+' : res = op1+op2;
		System.out.println("Sum is" +res);
		break;
		case '-': res = op1-op2;
		System.out.println("Differnece is" +res);
		break;
		case '*': res = op1-op2;
		System.out.println("Multiplication is" +res);
		break;
		case '/': res = op1-op2;
		System.out.println("division is" +res);
		break;
		case '%': res = op1-op2;
		System.out.println("modulus is" +res);
		break;
		default : System.out.println("invalid operator");
		}

	}

}
