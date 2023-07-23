
public class contructor_area {
int length,breadth;
void area(){
	System.out.println("this is method overloading");
}
void area(int s) {
	int a=s*s;
	System.out.println("the side of the square is: " +s);
	System.out.println("the area of the square under method overloading is :" +a);
}

void area(int l, int b) {
	int a=l*b;
	System.out.println("the length and breadth of the rectangle is " +l+ " "  +b);
	System.out.println("the area of rectangle under method overloading is " +a);
}

 contructor_area(){
	System.out.println("this is constructor overloading!");
}
contructor_area(int s){
	int a=s*s;
	System.out.println("the side of the square is:" +s);
	System.out.println("the area of the square under  constructor overloading is :" +a);
}
contructor_area(int l, int b) {

	int a;
	length=l;
	breadth=b;
	a=l*b;
	System.out.println("the length and breadth of the rectangle is "  +length+ " "  +breadth);
	System.out.println("the area of rectangle under method overloading is " +a);
}

	public static void main(String[] args) {
		contructor_area c= new contructor_area();
		contructor_area c2= new contructor_area(3);
		contructor_area c1=new contructor_area(2,3);
		c.area();
		c1.area(4);
		c2.area(4,5);			
}
}